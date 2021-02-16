package com.xworkz.matrimonysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.xworkz.matrimonysite.constant.Constants;
import com.xworkz.matrimonysite.dto.DTO;

import static com.xworkz.matrimonysite.constant.Constants.*;

public class MatrimonyDAOImpl implements MatrimonyDAO {
	DTO dto = new DTO();

	@Override
	public DTO getById(int id) {
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("Connecting...");
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM matrimony.bride where id= " + id);
			resultSet.next();
			dto.setId(resultSet.getInt(1));
			dto.setName(resultSet.getString(2));
			dto.setAge(resultSet.getInt(3));
			dto.setWeight(resultSet.getDouble(4));
			dto.setHeight(resultSet.getDouble(5));
			dto.setQualification(resultSet.getString(6));
			dto.setSalary(resultSet.getString(7));
			dto.setAddress(resultSet.getString(8));
			dto.setPhoneNo(resultSet.getString(9));

		} catch (SQLException e) {
			System.out.println("Failed to connect to database");

		}
		return dto;
	}

	@Override
	public DTO getAllBride() {
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connecting...");
			Statement stmt = con.createStatement();
			ResultSet resultSet1 = stmt.executeQuery("SELECT * FROM matrimony.bride ");
			while (resultSet1.next()) {
				dto.setId(resultSet1.getInt(1));
				dto.setName(resultSet1.getString(2));
				dto.setAge(resultSet1.getInt(3));
				dto.setWeight(resultSet1.getDouble(4));
				dto.setHeight(resultSet1.getDouble(5));
				dto.setQualification(resultSet1.getString(6));
				dto.setSalary(resultSet1.getString(7));
				dto.setAddress(resultSet1.getString(8));
				dto.setPhoneNo(resultSet1.getString(9));
				System.out.println(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection is failed");
		}
		return dto;
	}

	@Override
	public int CreateDTO(DTO dto) {
		int result = 0;
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			PreparedStatement stmt = con.prepareStatement("insert into matrimony.bride values(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setInt(3, dto.getAge());
			stmt.setDouble(4, dto.getHeight());
			stmt.setDouble(5, dto.getWeight());
			stmt.setString(6, dto.getQualification());
			stmt.setString(7, dto.getSalary());
			stmt.setString(8, dto.getAddress());
			stmt.setString(9, dto.getPhoneNo());
			result = stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("failed to connect data base..");

		}

		return result;
	}

	@Override
	public int UpdatePhoneNoById(String phoneNo, int id) {
		int result = 0;
		try {
			Connection con1 = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			PreparedStatement stmt1 = con1.prepareStatement("update matrimony.bride set phoneNo=? where id=?;");
			stmt1.setString(1, phoneNo);
			stmt1.setInt(2, id);
			result = stmt1.executeUpdate();

		} catch (SQLException e) {

			System.out.println("failed to connect database");

		}
		return result;
	}

	@Override
	public int DeleteById(int id) {
		int result1 = 0;
		try {
			Connection con2 = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			PreparedStatement stmt2 = con2.prepareStatement("delete  from matrimony.bride where id=?");
			stmt2.setInt(1, id);
			result1 = stmt2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("failed to connect database");

		}
		return result1;

	}

	@Override
	public int[] insertBrides(List<DTO> dto) {
		int[] result = new int[dto.size()];
		try {
			Connection con3 = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = con3.createStatement();
			for (DTO dto1 : dto) {
				String query = String.format(Constants.INSERT_QUERY, dto1.getId(), dto1.getName(), dto1.getHeight(),
						dto1.getAge(), dto1.getWeight(), dto1.getQualification(), dto1.getAddress(), dto1.getSalary(),
						dto1.getPhoneNo());

				stmt.addBatch(query);

			}
			result = stmt.executeBatch();

		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public int[] UpdateBrides(List<DTO> dto) {
		int[] results = new int[dto.size()];
		try {
			Connection con4 = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			PreparedStatement pstmt = con4.prepareStatement(UPDATE_QUERY);
			for (DTO dto2 : dto) {
				pstmt.setString(1, dto2.getQualification());
				pstmt.setString(2, dto2.getSalary());
				pstmt.setInt(3, dto2.getId());
				pstmt.addBatch();
			}

			results = pstmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect database");

		}

		return results;
	}

	@Override
	public int[] DeleteBrides(List<Integer> id) {
		int[] results = new int[id.size()];
		try {
			Connection con5 = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			PreparedStatement pstmt = con5.prepareStatement(DELETE_QUERY);
			for (Integer ids : id) {
				pstmt.setInt(1, ids);
				pstmt.addBatch();
			}

			results = pstmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect database");

		}

		return results;

	}

}