package com.xworkz.matrimony.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dao.MatrimonyDAOImpl;
import com.xworkz.matrimonysite.dto.DTO;

public class DeleteBrideApplication1 {

	public static void main(String[] args) {
		
		 DTO dto2=new DTO();
			
			
			MatrimonyDAO dao=new MatrimonyDAOImpl();
			MatrimonyService service=new MaterimonyServiceImpl(dao);
			List<Integer> brides=new ArrayList<Integer>();
			brides.add(1);
			int[] results=service.validateAndDeleteBrides(brides);
			for (int i = 0; i < results.length; i++) {
				if(results[i]==0) {
					System.out.println("bride failed to delete");
				}
				else {
					System.out.println("bride record successfully deleted");
				}
			

			}


}
}