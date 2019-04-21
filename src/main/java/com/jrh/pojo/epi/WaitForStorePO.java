package com.jrh.pojo.epi;


public class WaitForStorePO {

	private String lot_id;
	
	private String sub_id;
	
	private Long sub_qty;
	
	private String status;
	
	private String customerName;
	

	public String getLot_id() {
		return lot_id;
	}

	public void setLot_id(String lot_id) {
		this.lot_id = lot_id;
	}

	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}


	public long getSub_qty() {
		return sub_qty;
	}

	public void setSub_qty(long sub_qty) {
		this.sub_qty = sub_qty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "WaitForStorePO [lot_id=" + lot_id + ", sub_id=" + sub_id + ", sub_qty=" + sub_qty + ", status=" + status
				+ ", customerName=" + customerName + "]";
	}

	
	
	
}
