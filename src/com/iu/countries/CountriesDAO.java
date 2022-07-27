package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.iu.util.DBConnector;

public class CountriesDAO {

	public void getList() throws Exception {
		
		//1.DB연결
		Connection con = DBConnector.getConnection();
		
		//2.sql작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3.미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("Country_id");
			String name = rs.getString("Country_name");
			int rid = rs.getInt("region_id");
			System.out.println(id);
			System.out.println(name);
			System.out.println(rid);
		}
		DBConnector.disConnect(rs, st, con);//6.자원해제
		}
	
	//countries_id
//	public void getDetail() throw Exception{
	
	public void getDetail(String country_id) throws Exception{
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, country_id);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			String id = rs.getString("country_id");
			String name = rs.getString("country_name");
			System.out.println(id);
			System.out.println(name);
		}
		DBConnector.disConnect(rs, st, con);//6.자원해제
		
	}
		
		
	}

