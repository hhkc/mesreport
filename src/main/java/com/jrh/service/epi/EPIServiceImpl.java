package com.jrh.service.epi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jrh.dao.epi.EPIReportDao;
import com.jrh.pojo.epi.InventoryMaterialDetailPO;
import com.jrh.pojo.epi.WaitForStorePO;
import com.jrh.pojo.epi.WorkInProgressPO;

@Service("epiServiceImpl")
public class EPIServiceImpl implements EPIService{
	
	@Resource
	private EPIReportDao epiReportDaoImpl;
	
	@Override
	public List<Map<String, Object>> queryWaitForStorePagination(String status,int start,int end) {
		List<Map<String,Object>> waitForStores= new ArrayList<Map<String,Object>>();
		
		List<WaitForStorePO> waitForStorePOs = epiReportDaoImpl.queryWaitForStorePagination(status,start,end);
		if(waitForStorePOs != null && waitForStorePOs.size() > 0){
			for(int i = 0;i<waitForStorePOs.size();i++){
				
				Map<String,Object> waitForStoreMap = new HashMap<>();
				
				WaitForStorePO waitForStorePO = waitForStorePOs.get(i);
				waitForStoreMap.put("lotId", waitForStorePO.getLot_id());
				waitForStoreMap.put("subId", waitForStorePO.getSub_id());
				waitForStoreMap.put("subQty", waitForStorePO.getSub_qty());
				waitForStoreMap.put("status", waitForStorePO.getStatus());
				String lotId = waitForStorePO.getLot_id();
				lotId = getLotId(lotId);
			
				List<String> customerNameList = epiReportDaoImpl.queryCustomerName(lotId);
				if(customerNameList.size() > 0){
					waitForStoreMap.put("customerName", customerNameList.get(0));
				}else{
					System.out.println("lotId=" + lotId);
					continue;
				}
				
				waitForStores.add(waitForStoreMap);
			}
		}
		
		return waitForStores;
	}
	
	private String getLotId(String lotId){
		int len = lotId.length()-lotId.replace("-", "").length();
		String lot_id = "";
		if(lotId.contains(":")){
			if(len==3){
				lot_id = lotId;
			}else if(len == 4){
				lot_id = lotId.substring(0,lotId.lastIndexOf("-"));
			}else if(len == 5){
				String tmp = lotId.substring(0,lotId.lastIndexOf("-"));
				lot_id = tmp.substring(0, tmp.lastIndexOf("-"));
			}
		}else{
			if(len == 0){
				lot_id = lotId;
			}else if(len == 1){
				lot_id = lotId.substring(0,lotId.lastIndexOf("-"));
			}else if(len == 2){
				String tmp = lotId.substring(0,lotId.lastIndexOf("-"));
				lot_id = tmp.substring(0, tmp.lastIndexOf("-"));
			}
		}
		
		return lot_id;
	}

	@Override
	public int queryStoreCount(String status) {
		return epiReportDaoImpl.queryStoreCount(status);
	}

	@Override
	public List<WaitForStorePO> queryWaitForStores(String status,String sub_id,String lot_id) {
		List<WaitForStorePO> waitForStores= new ArrayList<WaitForStorePO>();
		
		List<WaitForStorePO> waitForStorePOs = epiReportDaoImpl.queryWaitForStores(status,sub_id,lot_id);
		if(waitForStorePOs != null && waitForStorePOs.size() > 0){
			for(int i = 0;i<waitForStorePOs.size();i++){
				
				Map<String,Object> waitForStoreMap = new HashMap<>();
				
				WaitForStorePO waitForStorePO = waitForStorePOs.get(i);
				waitForStoreMap.put("lotId", waitForStorePO.getLot_id());
				waitForStoreMap.put("subId", waitForStorePO.getSub_id());
				waitForStoreMap.put("subQty", waitForStorePO.getSub_qty());
				waitForStoreMap.put("status", waitForStorePO.getStatus());
				String lotId = waitForStorePO.getLot_id();
				lotId = getLotId(lotId);
			
				List<String> customerNameList = epiReportDaoImpl.queryCustomerName(lotId);
				if(customerNameList.size() > 0){
					waitForStoreMap.put("customerName", customerNameList.get(0));
					waitForStorePO.setCustomerName(customerNameList.get(0));
				}else{
					System.out.println("lotId=" + lotId);
					continue;
				}
				
				waitForStores.add(waitForStorePO);
			}
		}
		
		return waitForStores;
	}

	@Override
	public List<WorkInProgressPO> queryWorkInProgress(String taskorder,String lotid) {
		return epiReportDaoImpl.queryWorkInProgress(taskorder,lotid);
	}

	@Override
	public List<InventoryMaterialDetailPO> queryInventoryMaterialDetailPO(String taskorder, String lotid) {
		
		return epiReportDaoImpl.queryInventoryMaterialDetailPO(taskorder, lotid);
	}

	@Override
	public List<WaitForStorePO> queryoodpieces(String status, String sub_id, String lot_id) {
		List<WaitForStorePO> waitForStores= new ArrayList<WaitForStorePO>();
		
		List<WaitForStorePO> waitForStorePOs = epiReportDaoImpl.queryoodpieces(status,sub_id,lot_id);
		if(waitForStorePOs != null && waitForStorePOs.size() > 0){
			for(int i = 0;i<waitForStorePOs.size();i++){
				
				Map<String,Object> waitForStoreMap = new HashMap<>();
				
				WaitForStorePO waitForStorePO = waitForStorePOs.get(i);
				waitForStoreMap.put("lotId", waitForStorePO.getLot_id());
				waitForStoreMap.put("subId", waitForStorePO.getSub_id());
				waitForStoreMap.put("subQty", waitForStorePO.getSub_qty());
				waitForStoreMap.put("status", waitForStorePO.getStatus());
				String lotId = waitForStorePO.getLot_id();
				lotId = getLotId(lotId);
			
				List<String> customerNameList = epiReportDaoImpl.queryCustomerName(lotId);
				if(customerNameList.size() > 0){
					waitForStoreMap.put("customerName", customerNameList.get(0));
					waitForStorePO.setCustomerName(customerNameList.get(0));
				}else{
					System.out.println("lotId=" + lotId);
					continue;
				}
				
				waitForStores.add(waitForStorePO);
			}
		}
		
		return waitForStores;
	}

}
