package com.iu.test;

import java.util.ArrayList;
import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.departments.DepartmentsDAO;
import com.iu.departments.DepartmentsDTO;
import com.iu.departments.DepartmentsView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		RegionsDAO regionsDAO = new RegionsDAO();
		RegionsView regionsView = new RegionsView();
		
		CountriesDAO countriesDAO = new CountriesDAO();
		CountriesView countriesView = new CountriesView();
		
		DepartmentsDAO departmentsDAO = new DepartmentsDAO();
		DepartmentsView departmentsView = new DepartmentsView();
		
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView employeesView = new EmployeesView();
		
		//====================regiones
//		try {
////			ArrayList<RegionsDTO> ar = regionsDAO.getList();
////			regionsView.view(ar);
//			RegionsDTO regionsDTO = new RegionsDTO();
//			regionsDTO.setRegion_id(6);
//			regionsDTO.setRegion_name("Mars");
//			int result = regionsDAO.setRegion(regionsDTO);
//			//1이면 성공
//			//0이면 실패
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//==============countries=================
		try {
//			ArrayList<CountriesDTO> ar = countriesDAO.getList();
//			countriesView.view(ar);
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id("KD");
			countriesDTO.setCountry_name("DOYOUNG");
			countriesDTO.setRegion_id(3);
			int result = countriesDAO.setCountry(countriesDTO);
			
			if(result >0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//================departments=============
//		try {
//			ArrayList<DepartmentsDTO> ar = departmentsDAO.getList();
//			departmentsView.view(ar);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//======================employees=============
//		try {
//			ArrayList<EmployeesDTO> ar = employeesDAO.getList();
////			employeesView.view(ar);
//			employeesDAO.getSalaryInfo();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
	}
}
