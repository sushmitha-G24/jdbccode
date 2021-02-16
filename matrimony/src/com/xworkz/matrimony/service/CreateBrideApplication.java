package com.xworkz.matrimony.service;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class CreateBrideApplication {

	public static void main(String[] args) {
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MatrimonyService matrimonyService=new MaterimonyServiceImpl(dao);
		DTO dto=new DTO();
		dto.setId(6);
		dto.setName("seema");
		dto.setAge(22);
		dto.setHeight(5.5);
		dto.setWeight(60);
		dto.setQualification("B.com");
		dto.setSalary("60000");
		dto.setPhoneNo("36892980920");
		dto.setAddress("dubai");
		
		int result=matrimonyService.validateAndCreateBride(dto);
		if(result==1) {
			System.out.println("bride created successfully");
			
		}
		else {
			System.out.println("failed to create bride");
		}

	}

}
;