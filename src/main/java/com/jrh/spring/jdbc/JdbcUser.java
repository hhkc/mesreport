package com.jrh.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jrh.pojo.epi.WaitForStorePO;

public class JdbcUser {

	 private JdbcTemplate jdbcTemplate;    

	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	  
	   /* public person queryById(String id)
	    {
	        String sql = "select s.name from aa s where s.id=?";
	        Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
	        System.out.println(map);
	        return null;
	    }
	    
	    public List<person> queryAll()
	    {
	        String sql = "select * from aa";
	        return jdbcTemplate.query(sql, new RowMapper<person>(){

	            @Override
	            public person mapRow(ResultSet rs, int index) throws SQLException {
	                person p = new person();
	                p.setId(rs.getInt("id"));
	                p.setName(rs.getString("name"));
	                return p;
	            }});
	    }*/
	    
	    public int query(String status){
	    	//jdbcTemplate.query("select count(*) from wait_for_store_detail wfsd where wfsd.status= ?", status);
	    	int count = jdbcTemplate.queryForObject("select count(*) from wait_for_store_detail wfsd where wfsd.status= ?",Integer.class, status);
	    	return count;
	    }
	    
	    public List<WaitForStorePO> queryWaitForStore(String status){
	    	
	    	String sql = "select lot_id,sub_id,sub_qty,status from wait_for_store_detail where status=" +"'" +status+"'" + " order by sub_id";
	    	return jdbcTemplate.query(sql, new RowMapper<WaitForStorePO>(){

	            @Override
	            public WaitForStorePO mapRow(ResultSet rs, int index) throws SQLException {
	            	WaitForStorePO waitForStorePO = new WaitForStorePO();
	            	waitForStorePO.setLot_id(rs.getString("lot_id"));
	            	waitForStorePO.setSub_id(rs.getString("sub_id"));
	            	waitForStorePO.setSub_qty(rs.getLong("sub_qty"));
	            	waitForStorePO.setStatus(rs.getString("status"));
	                return waitForStorePO;
	            }});
	    }
	    
	    public List<String> queryCustomerName(String lotId){
	    	List<String> customerName = jdbcTemplate.queryForList("select ts.customer_name from technology_specification ts,lot l where l.product_rrn=ts.pn_rrn and l.lot_id=?", String.class,lotId);
	    	return customerName;
	    }
	    
}
