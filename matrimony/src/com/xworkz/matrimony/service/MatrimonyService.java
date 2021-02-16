package com.xworkz.matrimony.service;

import java.util.List;

import com.xworkz.matrimonysite.dto.DTO;

public interface MatrimonyService {
	public DTO getBride(int id);
	public DTO getAllBride();
	public int validateAndCreateBride(DTO dto);
	public int validateAndUpdateByPhoneNo(String phoneNo,int id);
	public int validateAndDeleteById(int id);
	int[] validateAndInsertBrides(List<DTO> dto);
	int[] validateAndUpdateBrides(List<DTO> dto);
	int[] validateAndDeleteBrides(List<Integer> id);




}
