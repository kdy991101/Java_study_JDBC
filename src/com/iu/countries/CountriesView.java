package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {

	
	public void view(CountriesDTO countriesDTO) {
		
		System.out.println("COUNTRY_ID\t COUNTRY_NAME\t REGION_ID");
		System.out.println("----------------------------");
		System.out.println(countriesDTO.getCountry_id());
		System.out.println(countriesDTO.getCountry_name());
		System.out.println(countriesDTO.getRegion_id());
		System.out.println("----------------------------");
	}
	
	public void view(ArrayList<CountriesDTO> ar) {
		
		for(CountriesDTO countriesDTO : ar) {
			
			System.out.println("COUNTRY_ID\t COUNTRY_NAME\t REGION_ID");
			System.out.println("----------------------------");
			System.out.println(countriesDTO.getCountry_id());
			System.out.println(countriesDTO.getCountry_name());
			System.out.println(countriesDTO.getRegion_id());
			System.out.println("----------------------------");
		}
	}
}
