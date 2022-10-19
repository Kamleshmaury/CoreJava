package com.hops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static void main(String[] args) {
		System.out.println(getAllEmployees());
	}
	
	public static int save(Employee emp) {
		int status=0;
		try
		{
			Connection con = Util.getConnection();
			String sql = "insert into employee(name,password,country,Email) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getCountry());
			ps.setString(4, emp.getEmail());
			
			status = ps.executeUpdate() ;
		}
		catch(Exception ex) {
			System.out.println("Some error in save employee"+ex);
		}
		return status;
	}
	
	public static int update(Employee emp) {
		int status=0;
		try
		{
			Connection con = Util.getConnection();
			String sql = "update employee set name=?,password=?,country=?,Email=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getCountry());
			ps.setString(4, emp.getEmail());
			ps.setInt(5, emp.getId());
			
			status = ps.executeUpdate() ;
		}
		catch(Exception ex) {
			System.out.println("Some error in update employee"+ex);
		}
		return status;
	}

	public static int delete(int id) {
		int status=0;
		try
		{
			Connection con = Util.getConnection();
			String sql = "delete from employee where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			status = ps.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println("error in delete "+ex);
		}
		return status;
	}
	
	public static Employee getEmployeeById(int id) {
		Employee emp = new Employee();
		try
		{
			Connection con = Util.getConnection();
			String sql = "select * from employee where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setCountry(rs.getString(4));
				emp.setEmail(rs.getString(5));
			}
		}
		catch(Exception ex)
		{
			System.out.println("error in get by id "+ex);
		}
		return emp;
	}
	
	public static List<Employee> getAllEmployees(){
		List<Employee> list = new ArrayList<>();
		try
		{
			Connection con = Util.getConnection();
			String sql = "select * from employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setCountry(rs.getString(4));
				emp.setEmail(rs.getString(5));
				list.add(emp);
			}
			System.out.println(list);
		}
		
		catch(Exception ex)
		{
			System.out.println("error in get All employee "+ex);
		}
		return list;
	}
}





















