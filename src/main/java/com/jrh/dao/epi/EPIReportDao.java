package com.jrh.dao.epi;

import java.util.List;

import com.jrh.pojo.epi.InventoryMaterialDetailPO;
import com.jrh.pojo.epi.WaitForStorePO;
import com.jrh.pojo.epi.WorkInProgressPO;

public interface EPIReportDao {

	int queryStoreCount(String status);
	
	List<WaitForStorePO> queryWaitForStorePagination(String status,int start,int end);
	
	List<WaitForStorePO> queryWaitForStores(String status,String sub_id,String lot_id);
	
	List<String> queryCustomerName(String lotId);
	
	List<WorkInProgressPO> queryWorkInProgress(String taskorder,String lotid);
	
	List<InventoryMaterialDetailPO> queryInventoryMaterialDetailPO(String taskorder,String lotid);
	
	List<WaitForStorePO> queryoodpieces(String status,String sub_id,String lot_id);
}
