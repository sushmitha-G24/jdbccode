package com.xworkz.matrimonysite.dao;

import java.util.List;

import com.xworkz.matrimonysite.dto.DTO;

public interface MatrimonyDAO {
		public DTO getById(int id);
		public DTO getAllBride();
		public int CreateDTO(DTO dto);
		public int UpdatePhoneNoById(String phoneNo,int id);
		public int DeleteById(int id);
		public int[] insertBrides(List<DTO> dto);
		public int[] UpdateBrides(List<DTO> dto);
		public int[] DeleteBrides(List<Integer> id);


		
		

}
