package com.iu.regions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO  {
	
	public ArrayList<RegionsDTO> getList() throws Exception{
		ArrayList<RegionsDTO> ar = new ArrayList<>();
	
	//1.regions table모든 데이터 가져오기
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
//		2. query 문 작성
		String sql = "SELECT * FROM REGIONS";
	
		//3.Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.
		
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
//		rs.next();//한줄읽기
			RegionsDTO regionsDTO = new RegionsDTO();
			regionsDTO.setRegion_id(rs.getInt("Region_id"));
			regionsDTO.setRegion_name(rs.getString("Region_name"));
			ar.add(regionsDTO);
//			(rs.getInt("Region_id")); 
//			rdt.setName(rs.getString("Region_name"));
//			rs.getInt("Region_id");
//			String name = rs.getString("Region_name");
//			System.out.println(id);
//			System.out.println(name);
		
		}
		DBConnector.disConnect(rs, st, con);//6.자원해제
		return ar;
			
		
	}
	public RegionsDTO getDetail(int region_id) throws Exception{
		RegionsDTO regionsDTO = null;
		
		Connection con = DBConnector.getConnection();//1 DB연결
		
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";//SQL문 작성//2
		
		PreparedStatement st = con.prepareStatement(sql);//3

		//4.?의 값 세팅
		st.setInt(1, region_id);
		
		
		ResultSet rs = st.executeQuery();//5
		
		if(rs.next()) {
			regionsDTO = new RegionsDTO();		
			int rid = rs.getInt(1);
			regionsDTO.setRegion_id(rid);
			regionsDTO.setRegion_name(rs.getString(2));
//			int rid = rs.getInt(1);
//			String rname = rs.getString(2);
//			System.out.println(rid);
//			System.out.println(rname);
		}
		DBConnector.disConnect(rs, st, con);//6.자원해제
		return regionsDTO;
		
	}
}
