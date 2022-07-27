package com.iu.regions;

import java.util.ArrayList;

import com.iu.test.TestMain;

public class RegionsView {
	
	//출력
	//view
	public void view(RegionsDTO regionsDTO) throws Exception{
//		TestMain tm = new TestMain();
//		tm.rview(null);
//		rda.getList(get);
		System.out.println("REGION_ID\t REGION_NAME");
		System.out.println("----------------------------");
			System.out.println(regionsDTO.getRegion_id()+"\t\t ");
			System.out.println(regionsDTO.getRegion_name());
			System.out.println("----------------------------");
		
	}
	public void view(ArrayList<RegionsDTO> ar) {
		System.out.println("REGION_ID\t REGION_NAME");
		System.out.println("----------------------------");
		for(RegionsDTO regionsDTO : ar) {
			System.out.println(regionsDTO.getRegion_id()+"\t\t ");
			System.out.println(regionsDTO.getRegion_name());
			System.out.println("----------------------------");
		}
	}
}
