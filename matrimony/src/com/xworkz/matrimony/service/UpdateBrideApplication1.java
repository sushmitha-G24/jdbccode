
package com.xworkz.matrimony.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class UpdateBrideApplication1 {

	
	public static void main(String[] args) {
		DTO dto1=new DTO();
		
		dto1.setId(5);
		dto1.setName("nagashree");
		dto1.setAge(23);
		dto1.setHeight(5.8);
		dto1.setWeight(55);
		dto1.setQualification("ms");
		dto1.setSalary("4500000");
		dto1.setPhoneNo("638929912");
		dto1.setAddress("pune");
		
		
       DTO dto2=new DTO();
		
		dto2.setId(6);
		dto2.setName("lalitha");
		dto2.setAge(25);
		dto2.setHeight(5.4);
		dto2.setWeight(58);
		dto2.setQualification("mcom");
		dto2.setSalary("9999999");
		dto2.setPhoneNo("526740032");
		dto2.setAddress("vizag");
		
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MatrimonyService service=new MaterimonyServiceImpl(dao);
		List<DTO> brides=new ArrayList<DTO>();
		brides.add(dto1);
		brides.add(dto2);
		int[] results=service.validateAndUpdateBrides(brides);
		for (int i = 0; i < results.length; i++) {
			if(results[i]==0) {
				System.out.println(brides.get(i).getName()+"bride failed to update");
			}
			else {
				System.out.println(brides.get(i).getName()+"bride successfully updates");
			}
			
		}
		
		

		
		

	}

}