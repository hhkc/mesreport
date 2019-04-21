package com.jrh.service.epi;

import java.util.List;
import java.util.Map;

import com.jrh.pojo.epi.InventoryMaterialDetailPO;
import com.jrh.pojo.epi.WaitForStorePO;
import com.jrh.pojo.epi.WorkInProgressPO;

public interface EPIService {

	int queryStoreCount(String status);
	
	List<Map<String,Object>> queryWaitForStorePagination(String status,int start,int end);
	List<WaitForStorePO> queryWaitForStores(String status,String sub_id,String lot_id);
	
	List<WorkInProgressPO> queryWorkInProgress(String taskoorder,String lotid);
	
	List<InventoryMaterialDetailPO> queryInventoryMaterialDetailPO(String taskorder,String lotid);
	
	List<WaitForStorePO> queryoodpieces(String status,String sub_id,String lot_id);
}
