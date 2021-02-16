package com.xworkz.matrimony.service;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class UpdateBrideApplication {

	public static void main(String[] args) {
		
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MatrimonyService service=new MaterimonyServiceImpl(dao);
		 
		DTO dto1=new DTO();
		
		
	    int result = service.validateAndUpdateByPhoneNo("2562882211", 4);
	    if(result ==1) {
	    	System.out.println("phoneNo updated successfully...");
	    }
	    else {
	    	System.out.println("failed to create Bride");
	    }
		

	}

}