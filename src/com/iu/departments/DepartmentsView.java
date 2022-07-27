package com.iu.departments;

import java.util.ArrayList;

import com.iu.countries.CountriesDTO;

public class DepartmentsView {
	
	public void view(DepartmentsDTO departmentsDTO) {
		
		System.out.println("DEPARTMENT_ID\t DEPARTMENT_NAME\t MANAGER_ID\t LOCATION_ID");
		System.out.println("----------------------------");
		System.out.println(departmentsDTO.getDepartment_id());
		System.out.println(departmentsDTO.getDepartment_name());
		System.out.println(departmentsDTO.getManager_id());
		System.out.println(departmentsDTO.getLocation_id());
		System.out.println("----------------------------");
	}
	
public void view(ArrayList<DepartmentsDTO> ar) {
		
		for(DepartmentsDTO departmentsDTO  : ar) {
			
			System.out.println("DEPARTMENT_ID\t DEPARTMENT_NAME\t MANAGER_ID\t LOCATION_ID");
			System.out.println("----------------------------");
			System.out.println(departmentsDTO.getDepartment_id());
			System.out.println(departmentsDTO.getDepartment_name());
			System.out.println(departmentsDTO.getManager_id());
			System.out.println(departmentsDTO.getLocation_id());
			System.out.println("----------------------------");
	}
}
	
}
