package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {

	
	public void view(EmployeesDTO employeesDTO) {
		System.out.println("EMPLOYEE_ID\t FIRST_NAME\t LAST_NAME\t EMAIL\t PHONE_NUMBER\t HIRE_DATE\t JOB_ID\t SALARY\t COMMISSION_PCT\t MANAGER\t DEPARTMENT_ID");
		System.out.println("-------------------------------------");
		System.out.println(employeesDTO.getEmplotee_id());
		System.out.println(employeesDTO.getFirst_name());
		System.out.println(employeesDTO.getLast_name());
		System.out.println(employeesDTO.getEmail());
		System.out.println(employeesDTO.getPhone_number());
		System.out.println(employeesDTO.getHire_date());
		System.out.println(employeesDTO.getJob_id());
		System.out.println(employeesDTO.getSalary());
		System.out.println(employeesDTO.getCommission_pct());
		System.out.println(employeesDTO.getManager());
		System.out.println(employeesDTO.getDepartment_id());
		System.out.println("-------------------------------------");
	}
	
	public void view(ArrayList<EmployeesDTO> ar) {
		
		for(EmployeesDTO employeesDTO : ar) {
			
			System.out.println("EMPLOYEE_ID\t FIRST_NAME\t LAST_NAME\t EMAIL\t PHONE_NUMBER\t HIRE_DATE\t JOB_ID\t SALARY\t COMMISSION_PCT\t MANAGER\t DEPARTMENT_ID");
			System.out.println("-------------------------------------");
			System.out.println(employeesDTO.getEmplotee_id());
			System.out.println(employeesDTO.getFirst_name());
			System.out.println(employeesDTO.getLast_name());
			System.out.println(employeesDTO.getEmail());
			System.out.println(employeesDTO.getPhone_number());
			System.out.println(employeesDTO.getHire_date());
			System.out.println(employeesDTO.getJob_id());
			System.out.println(employeesDTO.getSalary());
			System.out.println(employeesDTO.getCommission_pct());
			System.out.println(employeesDTO.getManager());
			System.out.println(employeesDTO.getDepartment_id());
			System.out.println("-------------------------------------");
			
		}
	}
}
