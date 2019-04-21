/*package com.jrh.controller.test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrh.common.constant.EPIConstant;
import com.jrh.service.epi.EPIService;
import com.jrh.spring.jdbc.JdbcUser;

@Controller
@RequestMapping("/epi")
public class TestController {

	@Resource
	private JdbcUser jdbcUser;
	
	@Autowired
	private EPIService epiServiceImpl;
	
	@RequestMapping("/test")
	public void test(){
		
		//不加条件的待入库数量
		int count = jdbcUser.query(EPIConstant.WAIT_STATUS);

		//有条的待入库数量
		List<Map<String,Object>> waitForStoreList =  epiServiceImpl.getWaitForStores(EPIConstant.WAIT_STATUS);
		int count2 = waitForStoreList.size();
		
		
		if(count != count2){
			System.out.println("入库数据异常");
		}else{
			for(int i = 0;i<waitForStoreList.size();i++){
				Map<String,Object> waitForStoreMap = waitForStoreList.get(i);
				String lotId = (String) waitForStoreMap.get("lotId");
				String subId = (String) waitForStoreMap.get("subId");
				String customerName = (String) waitForStoreMap.get("customerName");
				Long subQty = (Long) waitForStoreMap.get("subQty");
				System.out.println("[lotId=" + lotId +",subId=" + subId + ",customerName=" + customerName + ",subQty=" + subQty);
			}
		}

	}
}
*/