package com.jrh.pojo.epi;

public class WorkInProgressPO {

	private String customer_name; //客户名
	
	private String instance_id; //任务单号
	
	private String lot_id;  //批次
	
	private Long qty;  //数量
	
	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	private String instance_desc; //工步
	
	private String lot_status; //状态
	
	private String started_timestamp; //时间

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getInstance_id() {
		return instance_id;
	}

	public void setInstance_id(String instance_id) {
		this.instance_id = instance_id;
	}

	public String getLot_id() {
		return lot_id;
	}

	public void setLot_id(String lot_id) {
		this.lot_id = lot_id;
	}

	

	public String getInstance_desc() {
		return instance_desc;
	}

	public void setInstance_desc(String instance_desc) {
		this.instance_desc = instance_desc;
	}

	public String getLot_status() {
		return lot_status;
	}

	public void setLot_status(String lot_status) {
		this.lot_status = lot_status;
	}

	public String getStarted_timestamp() {
		return started_timestamp;
	}

	public void setStarted_timestamp(String started_timestamp) {
		this.started_timestamp = started_timestamp;
	}

	@Override
	public String toString() {
		return "WorkInProgressPO [customer_name=" + customer_name + ", instance_id=" + instance_id + ", lot_id="
				+ lot_id + ", qty=" + qty + ", instance_desc=" + instance_desc + ", lot_status=" + lot_status
				+ ", started_timestamp=" + started_timestamp + "]";
	}
	
	
}
