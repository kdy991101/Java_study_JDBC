package com.iu.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.countries.CountriesDTO;
import com.iu.util.DBConnector;

public class DepartmentsDAO {
	
	public ArrayList<DepartmentsDTO> getList() throws Exception{
		ArrayList<DepartmentsDTO> ar = new ArrayList<>();
		//1.DB연결
		Connection con = DBConnector.getConnection();
		//2.sql작성
		String sql = "SELECT * FROM DEPARTMENTS";
		//3.미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		//4.전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			DepartmentsDTO departmentsDTO = new DepartmentsDTO();
			departmentsDTO.setDepartment_id(rs.getInt("department_id"));
			departmentsDTO.setDepartment_name(rs.getNString("department_name"));
			departmentsDTO.setManager_id(rs.getInt("manager_id"));
			departmentsDTO.setLocation_id(rs.getInt("location_id"));
			ar.add(departmentsDTO);
		}
		
		DBConnector.disConnect(rs, st, con);//6.자원해제
		return ar;
		
	}
	
	//countries_id
//	public void getDetail() throw Exception{
	
	public DepartmentsDTO getDetail(int department_id) throws Exception{
		DepartmentsDTO  departmentsDTO = null;
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, department_id);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			departmentsDTO.setDepartment_id(rs.getInt("department_id"));
			departmentsDTO.setDepartment_name(rs.getString("department_name"));
			departmentsDTO.setManager_id(rs.getInt("manager_id"));
			departmentsDTO.setLocation_id(rs.getInt("location_id"));
		}
		DBConnector.disConnect(rs, st, con);//6.자원해제
		
		return departmentsDTO;
	}

}
