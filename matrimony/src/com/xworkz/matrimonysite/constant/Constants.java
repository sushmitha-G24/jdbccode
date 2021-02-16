package com.xworkz.matrimonysite.constant;

public class Constants {
	public static String DB_URL="jdbc:mysql://localhost:3306";
	public static String USER_NAME="root";
	public static String PASSWORD="root";
	public static final String INSERT_QUERY="insert into matrimony.bride values(%s,'%s',%s,%s,%s,'%s','%s','%s','%s')";
	public static final String UPDATE_QUERY="update matrimony.bride set qualification=?,salary=? where id=?";
    public static final String DELETE_QUERY="delete from matrimony.bride where id=?";
}
 