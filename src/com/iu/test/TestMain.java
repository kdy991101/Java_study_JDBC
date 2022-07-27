package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
	
//		try {
//			DBConnector.getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		RegionsDAO da = new RegionsDAO();
//		try {
//			da.getList();
//			da.getDetail(1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		CountriesDAO cda = new CountriesDAO();
//		try {
////			cda.getList();
//			cda.getDetail("AU");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//	public void rview(RegionsDAO rda) {
//		try {
//			rda.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
		RegionsDAO regionsDAO = new RegionsDAO();
		RegionsDTO regionsDTO = new RegionsDTO();
		RegionsView rv = new RegionsView();
		try {
			rv.view(regionsDTO);
			ArrayList<RegionsDTO> ar =  regionsDAO.getList();
//			rv.view(regionsDTO);
//			rv.regionsDAO.getList();
//			rv.view(regionsDAO.getDetail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
