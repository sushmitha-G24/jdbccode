package com.xworkz.matrimony.service;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class GetAllBrideApplication {

	public static void main(String[] args) {
		MatrimonyDAO dao=new MatrimonyDAOImpl();
		MatrimonyDAO dao1 = new MatrimonyDAOImpl();
		DTO dto1 = dao1.getAllBride();
	    System.out.println(dto1);

		//MatrimonyDAO dao2 = new MatrimonyDAOImpl();
		//MatrimonyService service1 = new MaterimonyServiceImpl(dao);
	//	DTO dto2 = service1.getAllBride();
	}


	}


