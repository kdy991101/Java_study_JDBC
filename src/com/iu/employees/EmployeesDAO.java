package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	
	public ArrayList<EmployeesDTO> getList() throws Exception{
		ArrayList<EmployeesDTO> ar = new ArrayList<>();
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeesDTO employeesDTO = new EmployeesDTO();
			employeesDTO.setEmplotee_id(rs.getInt("employee_id"));
			employeesDTO.setFirst_name(rs.getString("first_name"));
			employeesDTO.setLast_name(rs.getString("last_name"));
			employeesDTO.setEmail(rs.getString("email"));
			employeesDTO.setPhone_number(rs.getString("phone_number"));
			employeesDTO.setHire_date(rs.getInt("hire_date"));
			employeesDTO.setJob_id(rs.getString("job_id"));
			employeesDTO.setSalary(rs.getInt("salary"));
			employeesDTO.setCommission_pct(rs.getString("commission_pct"));
			employeesDTO.setManager(rs.getInt("manager_id"));
			employeesDTO.setDepartment_id(rs.getInt("department_id"));
			ar.add(employeesDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
	
	public EmployeesDTO getDetail(int employee_id) throws Exception{
		EmployeesDTO employeesDTO = null;
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, employee_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeesDTO.setEmplotee_id(rs.getInt("employee_id"));
			employeesDTO.setFirst_name(rs.getString("first_name"));
			employeesDTO.setLast_name(rs.getString("last_name"));
			employeesDTO.setEmail(rs.getString("email"));
			employeesDTO.setPhone_number(rs.getString("phone_number"));
			employeesDTO.setHire_date(rs.getInt("hire_date"));
			employeesDTO.setJob_id(rs.getString("job_id"));
			employeesDTO.setSalary(rs.getInt("salary"));
			employeesDTO.setCommission_pct(rs.getString("commission_pct"));
			employeesDTO.setManager(rs.getInt("manager_id"));
			employeesDTO.setDepartment_id(rs.getInt("department_id"));
			
		}
		DBConnector.disConnect(rs, st, con);
		return employeesDTO;
	}

}
