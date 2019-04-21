package com.jrh.pojo.epi;

public class InventoryMaterialDetailPO {

	private String customer_name; //客户名称
	
	private String material_number; //任务单号
	
	private String sub_id; //盒号
	
	private String lot_id; //批次号
	
	private Long qty;  //数量
	
	private String status; //状态
	
	private String stoer_date; //时间

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getMaterial_number() {
		return material_number;
	}

	public void setMaterial_number(String material_number) {
		this.material_number = material_number;
	}

	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}

	public String getLot_id() {
		return lot_id;
	}

	public void setLot_id(String lot_id) {
		this.lot_id = lot_id;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoer_date() {
		return stoer_date;
	}

	public void setStoer_date(String stoer_date) {
		this.stoer_date = stoer_date;
	}

	@Override
	public String toString() {
		return "InventoryMaterialDetailPO [customer_name=" + customer_name + ", material_number=" + material_number
				+ ", sub_id=" + sub_id + ", lot_id=" + lot_id + ", qty=" + qty + ", status=" + status + ", stoer_date="
				+ stoer_date + "]";
	}
	
	
}
