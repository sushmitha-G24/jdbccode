package com.xworkz.matrimony.service;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class deleteBrideApplication {

	public static void main(String[] args) {
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MatrimonyService service=new MaterimonyServiceImpl(dao);
		
		DTO dto2=new DTO();
		
		  int result = service.validateAndDeleteById(1);
		    if(result ==1) {
		    	System.out.println("record delete successfully");
		    }
		    else {
		    	System.out.println("failed to delete Bride");
		    }
			

		}

		
	}


