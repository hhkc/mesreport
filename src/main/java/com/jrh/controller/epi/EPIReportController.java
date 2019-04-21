package com.jrh.controller.epi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jrh.common.constant.EPIConstant;
import com.jrh.pojo.epi.InventoryMaterialDetailPO;
import com.jrh.pojo.epi.WaitForStorePO;
import com.jrh.pojo.epi.WorkInProgressPO;
import com.jrh.service.epi.EPIService;

@Controller
@RequestMapping("/epireport")
public class EPIReportController {

	@Autowired
	private EPIService epiServiceImpl;

	@RequestMapping("towaitforstore")
	public String toWaitForStore() {
		return "epi/waitforstore";
	}

	@RequestMapping("/waitForStores")
	@ResponseBody
	public List<WaitForStorePO> getWaitForStores(HttpServletRequest request, WaitForStorePO wfsPO) {
	
		List<WaitForStorePO> waitForStores = epiServiceImpl.queryWaitForStores(EPIConstant.WAIT_STATUS,
				wfsPO.getSub_id(), wfsPO.getLot_id());

		return waitForStores;
	}
	
	@RequestMapping("toinventory")
	public String toinventory(){
		return "epi/inventorymaterialdetail";
	}
	
	@RequestMapping("inventorymaterialdetail")
	@ResponseBody
	public List<InventoryMaterialDetailPO> getInventoryMaterialDetails(HttpServletRequest request,InventoryMaterialDetailPO inventoryMaterialDetailPO){
		String taskorder = inventoryMaterialDetailPO.getMaterial_number();
		String lotid = inventoryMaterialDetailPO.getLot_id();
		return epiServiceImpl.queryInventoryMaterialDetailPO(taskorder, lotid);
	}
	
	/**
	 * 零头片库存
	 * @return
	 * @since
	 */
	@RequestMapping("tooddpiece")
	public String tooddpiece(){
		return "epi/oddpiece";
	}
	
	@RequestMapping("/oddpiece")
	@ResponseBody
	public List<WaitForStorePO> getOddpieces(HttpServletRequest request, WaitForStorePO wfsPO) {
	
		List<WaitForStorePO> waitForStores = epiServiceImpl.queryoodpieces(EPIConstant.WAIT_STATUS,
				wfsPO.getSub_id(), wfsPO.getLot_id());

		return waitForStores;
	}
	
	@RequestMapping("/toworkin")
	public String getWorkIn(){
		return "epi/workinprogress";
	}
	
	@RequestMapping("/workInProgress")
	@ResponseBody
	public List<WorkInProgressPO> getWorkInProgress(HttpServletRequest request,WorkInProgressPO workInProgressPO){
		String taskorder = workInProgressPO.getInstance_id();
		String lotid = workInProgressPO.getLot_id();
		return epiServiceImpl.queryWorkInProgress(taskorder,lotid);
	}

	/*
	 * @RequestMapping("/waitForStore")
	 * 
	 * @ResponseBody public List<WaitForStorePO>
	 * getWaitForStore(HttpServletRequest request,String action){
	 * 
	 * ModelAndView mav = new ModelAndView();
	 * 
	 * //不加条件的待入库数量 int count =
	 * epiServiceImpl.queryStoreCount(EPIConstant.WAIT_STATUS);
	 * 
	 * int start = 1; int end = 15; if(action != null && "pre".equals(action)){
	 * if(EPIConstant.DEFAULT_ROW_NUM > 15){ start =EPIConstant.DEFAULT_ROW_NUM
	 * - 30 + 1; end = EPIConstant.DEFAULT_ROW_NUM - 15;
	 * EPIConstant.DEFAULT_ROW_NUM = EPIConstant.DEFAULT_ROW_NUM - 15; } }else
	 * if(action != null && "nex".equals(action)){ start =
	 * EPIConstant.DEFAULT_ROW_NUM + 1; end = EPIConstant.DEFAULT_ROW_NUM + 15;
	 * EPIConstant.DEFAULT_ROW_NUM = EPIConstant.DEFAULT_ROW_NUM + 15; }
	 * 
	 * 
	 * 
	 * //有条的待入库数量 int count2 = 0; List<Map<String,Object>> waitForStoreList ;
	 * if(action != null && "getAll".equals(action)){ waitForStoreList =
	 * epiServiceImpl.queryWaitForStores(EPIConstant.WAIT_STATUS,sub_id); count2
	 * = waitForStoreList.size(); if(count != count2){
	 * System.out.println("入库数据异常"); } }else{ waitForStoreList =
	 * epiServiceImpl.queryWaitForStorePagination(EPIConstant.WAIT_STATUS,start,
	 * end); }
	 * 
	 * 
	 * //mav.addObject("waitForStoreList", waitForStoreList);
	 * 
	 * if(count != count2){ System.out.println("入库数据异常"); }else{
	 * List<WaitForStorePO> waitForStorePOs = new ArrayList<>();
	 * 
	 * for(int i = 0;i<waitForStoreList.size();i++){ Map<String,Object>
	 * waitForStoreMap = waitForStoreList.get(i); String lotId = (String)
	 * waitForStoreMap.get("lotId"); String subId = (String)
	 * waitForStoreMap.get("subId"); String customerName = (String)
	 * waitForStoreMap.get("customerName"); Long subQty = (Long)
	 * waitForStoreMap.get("subQty");
	 * 
	 * WaitForStorePO waitForStorePO = new WaitForStorePO();
	 * waitForStorePO.setLot_id(lotId); waitForStorePO.setSub_id(subId);
	 * waitForStorePO.setCustomerName(customerName);
	 * waitForStorePO.setSub_qty(subQty);
	 * 
	 * waitForStorePOs.add(waitForStorePO);
	 * 
	 * if(i < 15){ waitForStorePOs.add(waitForStorePO); }
	 * 
	 * 
	 * System.out.println("[lotId=" + lotId +",subId=" + subId +
	 * ",customerName=" + customerName + ",subQty=" + subQty); }
	 * 
	 * mav.addObject("waitForStorePOs", waitForStorePOs); }
	 * 
	 * mav.setViewName("epi/test"); return waitForStorePOs;
	 * 
	 * }
	 */

	@RequestMapping("/report")
	public void getReqportData(HttpServletRequest request, String reportName) {
		System.out.println("reportName:" + reportName);
	}

}
