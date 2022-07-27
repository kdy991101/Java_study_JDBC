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
//			ArrayList<RegionsDTO> ar = regionsDAO.getList();
//			regionsView.view(ar);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//==============countries=================
//		try {
//			ArrayList<CountriesDTO> ar = countriesDAO.getList();
//			countriesView.view(ar);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//================departments=============
//		try {
//			ArrayList<DepartmentsDTO> ar = departmentsDAO.getList();
//			departmentsView.view(ar);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//======================employees=============
		try {
			ArrayList<EmployeesDTO> ar = employeesDAO.getList();
			employeesView.view(ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
