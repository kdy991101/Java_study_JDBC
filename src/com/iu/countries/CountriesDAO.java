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
	
	}
}
