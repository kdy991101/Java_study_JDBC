package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	
	public void getSalaryInfo() throws Exception{//7-28
		
		Connection con = DBConnector.getConnection();//연결
		
		String sql = "SELECT SUM(SALARY), AVG(SALARY),MAX(SALARY) AS MAX FROM EMPLOYEES";//SQL문
		
		PreparedStatement st = con.prepareStatement(sql);//미리전송
		
		ResultSet rs = st.executeQuery();//최종 전송 후 결과 처리
		
		//데이터가 무조건 온다면 if문의 의미가 없기에 rs.next();만 선언해도 ㄱㅊ
		if(rs.next()) {
			//데이터가 있으면 꺼내자
			int sum = rs.getInt("sum(salary)");
			double avg = rs.getDouble(2);
			int max = rs.getInt("MAX"); 
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
		}
		
		
		
		DBConnector.disConnect(rs, st, con);//자원 해제
		
	}
	
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
			employeesDTO.setHire_date(rs.getDate("hire_date"));
			employeesDTO.setJob_id(rs.getString("job_id"));
			employeesDTO.setSalary(rs.getInt("salary"));
			employeesDTO.setCommission_pct(rs.getDouble("commission_pct"));
			employeesDTO.setManager_id(rs.getInt("manager_id"));
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
			employeesDTO.setHire_date(rs.getDate("hire_date"));
			employeesDTO.setJob_id(rs.getString("job_id"));
			employeesDTO.setSalary(rs.getInt("salary"));
			employeesDTO.setCommission_pct(rs.getDouble("commission_pct"));
			employeesDTO.setManager_id(rs.getInt("manager_id"));
			employeesDTO.setDepartment_id(rs.getInt("department_id"));
			
		}
		DBConnector.disConnect(rs, st, con);
		return employeesDTO;
	}

}
