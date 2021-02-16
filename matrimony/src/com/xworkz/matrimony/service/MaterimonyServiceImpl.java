package com.xworkz.matrimony.service;

import java.util.List;

import com.xworkz.matrimonysite.dao.MatrimonyDAO;
import com.xworkz.matrimonysite.dto.DTO;

public class MaterimonyServiceImpl implements MatrimonyService {

	MatrimonyDAO dao;

	public MaterimonyServiceImpl(MatrimonyDAO dao) {
		this.dao = dao;

	}

	@Override
	public DTO getBride(int id) {
		if (0 == id) {
			System.out.println("invalid id");
			return null;
		}
		return dao.getById(1);
	}

	@Override
	public DTO getAllBride() {

		return dao.getAllBride();

	}

	@Override
	public int validateAndCreateBride(DTO dto) {
		if (null == dto) {
			System.out.println("bride cant be null");
			return 0;
		} else if (dto.getId() == 0) {
			System.out.println("invalid id");
			return 0;
		} else {
			return dao.CreateDTO(dto);

		}

	}

	@Override
	public int validateAndUpdateByPhoneNo(String phoneNo, int id) {
		if (null == phoneNo && id == 0) {
			System.out.println("phoneNo number is updated");
			return 0;

		} else {
			System.out.println("phoneNo is not updated");

		}

		return dao.UpdatePhoneNoById(phoneNo, id);
	}

	@Override
	public int validateAndDeleteById(int id) {
		if (id == 0) {
			System.out.println("invalid id");
			return 0;
		} else {
			System.out.println("id is not deleted");

		}
		return dao.DeleteById(id);

	}

	@Override
	public int[] validateAndInsertBrides(List<DTO> dto) {
		if (dto == null) {
			System.out.println("bride list cant be null");
			int[] result = new int[dto.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			return result;

		} else {

		}
		return dao.insertBrides(dto);
	}

	@Override
	public int[] validateAndUpdateBrides(List<DTO> dto) {
		if (dto == null) {
			System.out.println("brides list cant be null");
			int[] results = new int[dto.size()];
			for (int i = 0; i < results.length; i++) {
				results[i] = 0;

			}

			return results;

		}

		return dao.UpdateBrides(dto);

	}

	@Override
	public int[] validateAndDeleteBrides(List<Integer> id) {
		if (id == null) {
			System.out.println("brides list cant be null");
			int[] results = new int[id.size()];
			for (int i = 0; i < results.length; i++) {
				results[i] = 0;

			}
			return results;
		}

		return dao.DeleteBrides(id);
	}
}
