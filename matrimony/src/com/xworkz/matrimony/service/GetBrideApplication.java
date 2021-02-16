package com.xworkz.matrimony.service;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class GetBrideApplication {

	public static void main(String[] args) {
		MatrimonyDAO matrimonydao = new MatrimonyDAOImpl();
	    DTO dto3 = matrimonydao.getById(4);
		System.out.println(dto3);

		MatrimonyDAO dao = new MatrimonyDAOImpl();
		MatrimonyService service = new MaterimonyServiceImpl(dao);
		DTO dto = service.getBride(1);

		if (dto != null) {
			System.out.println(dto);
		}

		
}
}
