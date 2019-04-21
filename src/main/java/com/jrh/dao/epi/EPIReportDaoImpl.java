package com.jrh.dao.epi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jrh.pojo.epi.InventoryMaterialDetailPO;
import com.jrh.pojo.epi.WaitForStorePO;
import com.jrh.pojo.epi.WorkInProgressPO;

public class EPIReportDaoImpl implements EPIReportDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int queryStoreCount(String status) {
		int count = jdbcTemplate.queryForObject("select count(*) from wait_for_store_detail wfsd where wfsd.status= ?",
				Integer.class, status);
		return count;
	}

	@Override
	public List<WaitForStorePO> queryWaitForStorePagination(String status, int start, int end) {

		String sql = "select lot_id,sub_id,sub_qty,status from (select rownum as rn,t.* from wait_for_store_detail t where t.status="
				+ "'" + status + "' order by sub_id) where 1=1  and rn between " + start + " and " + end;
		/*
		 * String sql =
		 * "select lot_id,sub_id,sub_qty,status from wait_for_store_detail where status="
		 * +"'" +status +"' and rownum between "+start+" and "+end+
		 * " order by sub_id";
		 */ return jdbcTemplate.query(sql, new RowMapper<WaitForStorePO>() {

			@Override
			public WaitForStorePO mapRow(ResultSet rs, int index) throws SQLException {
				WaitForStorePO waitForStorePO = new WaitForStorePO();
				waitForStorePO.setLot_id(rs.getString("lot_id"));
				waitForStorePO.setSub_id(rs.getString("sub_id"));
				waitForStorePO.setSub_qty(rs.getLong("sub_qty"));
				waitForStorePO.setStatus(rs.getString("status"));
				return waitForStorePO;
			}
		});
	}

	@Override
	public List<String> queryCustomerName(String lotId) {
		List<String> customerName = jdbcTemplate.queryForList(
				"select ts.customer_name from technology_specification ts,lot l where l.product_rrn=ts.pn_rrn and l.lot_id=?",
				String.class, lotId);
		return customerName;
	}

	@Override
	public List<WaitForStorePO> queryWaitForStores(String status, String sub_id, String lot_id) {
		String sql = "select lot_id,sub_id,sub_qty,status from wait_for_store_detail where status=" + "'" + status
				+ "'";
		if (sub_id != null && !"".equals(sub_id)) {
			sub_id = sub_id.toUpperCase();
			sql = sql + " and sub_id like '" + sub_id + "%'";
		}

		if (lot_id != null && !"".equals(lot_id)) {
			lot_id = lot_id.toUpperCase();
			sql = sql + " and lot_id like '" + lot_id + "%'";
		}
		sql = sql + " order by sub_id";

		System.out.println("sql:->" + sql);

		return jdbcTemplate.query(sql, new RowMapper<WaitForStorePO>() {

			@Override
			public WaitForStorePO mapRow(ResultSet rs, int index) throws SQLException {
				WaitForStorePO waitForStorePO = new WaitForStorePO();
				waitForStorePO.setLot_id(rs.getString("lot_id"));
				waitForStorePO.setSub_id(rs.getString("sub_id"));
				waitForStorePO.setSub_qty(rs.getLong("sub_qty"));
				waitForStorePO.setStatus(rs.getString("status"));
				return waitForStorePO;
			}
		});

	}

	/**
	 * 在制品查询
	 */
	
	@Override
	public List<WorkInProgressPO> queryWorkInProgress(String taskorder,String lotid) {
		String sql = "select ts.customer_name,n2.instance_id,l.lot_id,l.qty1,n1.instance_desc,l.lot_status,l.started_timestamp from lot l,named_object n1,named_object n2,technology_specification ts where l.lot_status in ('RUNNING','DISPATH','WAITING','HOLD') and n1.instance_rrn=l.operation_rrn and n1.object='OPERATION' and n2.instance_rrn=l.task_order_rrn and n2.object='TASKORDER' and ts.pn_rrn=l.product_rrn ";
		if(taskorder != null && !"".equals(taskorder)){
			taskorder = taskorder.toUpperCase();
			sql = sql + "and n2.instance_id like '" + taskorder + "%'";
		}
		
		if(lotid != null && !"".equals(lotid)){
			lotid = lotid.toUpperCase();
			sql = sql + "and l.lot_id like '" + lotid + "%'";
		}
		sql = sql + " order by n2.instance_id";
		System.out.println("sql:->" + sql);
		return jdbcTemplate.query(sql, new RowMapper<WorkInProgressPO>() {

			@Override
			public WorkInProgressPO mapRow(ResultSet rs, int index) throws SQLException {
				WorkInProgressPO workInProgressPO = new WorkInProgressPO();
				
				workInProgressPO.setCustomer_name(rs.getString("customer_name"));
				workInProgressPO.setInstance_desc(rs.getString("instance_desc"));
				workInProgressPO.setInstance_id(rs.getString("instance_id"));
				workInProgressPO.setLot_id(rs.getString("lot_id"));
				workInProgressPO.setLot_status(rs.getString("lot_status"));
				workInProgressPO.setQty(rs.getLong("qty1"));
				workInProgressPO.setStarted_timestamp(rs.getString("started_timestamp"));
				return workInProgressPO;
			}
		});
	}
	
	
	@Override
	public List<InventoryMaterialDetailPO> queryInventoryMaterialDetailPO(String taskorder, String lotid) {
		String sql = "select ts.customer_name,imd.material_number,imd.sub_id,imd.lot_id,imd.qty,imd.status,imd.stoer_date from inventory_material_detail imd,lot l,technology_specification ts where imd.status='CONFIRM' and l.lot_rrn=imd.lot_rrn and ts.pn_rrn=l.product_rrn";
		if(taskorder != null && !"".equals(taskorder)){
			taskorder = taskorder.toUpperCase();
			sql = sql + " and imd.material_number like '" + taskorder + "%'";
		}
		
		if(lotid != null && !"".equals(lotid)){
			lotid = lotid.toUpperCase();
			sql = sql + " and imd.lot_id like '" + lotid + "%'";
		}
		sql = sql + " order by imd.sub_id";
		System.out.println("sql:->" + sql);
		return jdbcTemplate.query(sql, new RowMapper<InventoryMaterialDetailPO>() {

			@Override
			public InventoryMaterialDetailPO mapRow(ResultSet rs, int index) throws SQLException {
				InventoryMaterialDetailPO inventoryMaterialDetailPO = new InventoryMaterialDetailPO();
				
				inventoryMaterialDetailPO.setCustomer_name(rs.getString("customer_name"));
				inventoryMaterialDetailPO.setLot_id(rs.getString("lot_id"));
				inventoryMaterialDetailPO.setMaterial_number(rs.getString("material_number"));
				inventoryMaterialDetailPO.setQty(rs.getLong("qty"));
				inventoryMaterialDetailPO.setStatus(rs.getString("status"));
				inventoryMaterialDetailPO.setStoer_date(rs.getString("stoer_date"));
				inventoryMaterialDetailPO.setSub_id(rs.getString("sub_id"));
				return inventoryMaterialDetailPO;
			}
		});
	}

	@Override
	public List<WaitForStorePO> queryoodpieces(String status, String sub_id, String lot_id) {
		String sql = "select lot_id,sub_id,sub_qty,status from wait_for_store_detail where status=" + "'" + status 
				+ "'";
		if (sub_id != null && !"".equals(sub_id)) {
			sub_id = sub_id.toUpperCase();
			sql = sql + " and sub_id like '" + sub_id + "%'";
		}else{
			sql = sql + " and sub_id like '%-'";
		}

		if (lot_id != null && !"".equals(lot_id)) {
			lot_id = lot_id.toUpperCase();
			sql = sql + " and lot_id like '" + lot_id + "%'";
		}
		sql = sql + " order by sub_id";

		System.out.println("sql:->" + sql);

		return jdbcTemplate.query(sql, new RowMapper<WaitForStorePO>() {

			@Override
			public WaitForStorePO mapRow(ResultSet rs, int index) throws SQLException {
				WaitForStorePO waitForStorePO = new WaitForStorePO();
				waitForStorePO.setLot_id(rs.getString("lot_id"));
				waitForStorePO.setSub_id(rs.getString("sub_id"));
				waitForStorePO.setSub_qty(rs.getLong("sub_qty"));
				waitForStorePO.setStatus(rs.getString("status"));
				return waitForStorePO;
			}
		});
	}
	
}
