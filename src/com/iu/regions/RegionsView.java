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
		System.out.println(regionsDTO.getRegion_id());
		System.out.println(regionsDTO.getRegion_name());
		
		
	}
	public void view(ArrayList<RegionsDTO> ar) {
		for(RegionsDTO regionsDTO : ar) {
			System.out.println(regionsDTO.getRegion_id());
			System.out.println(regionsDTO.getRegion_name());
		}
	}
}
