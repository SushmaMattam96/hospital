package com.cg.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bean.appointment;
import com.cg.exception.HspException;
import com.cg.utility.JdbcUtility;

public class HspDaoImp implements HspDao{
Connection connection=null;
PreparedStatement statement = null;
ResultSet resultSet = null;

public int insert(appointment appoint) throws HspException {
	// TODO Auto-generated method stub
	
	connection =JdbcUtility.getConnection();
	int id=0;
	try {
		statement = connection.prepareStatement(QueryMapper.insert);
		statement.setString(1, appoint.getName());
		statement.setLong(2, appoint.getPhone());
		statement.setString(3, appoint.getEmail());
		statement.setInt(4, appoint.getAge());
		statement.setString(5,appoint.getGender());
		statement.setString(6, appoint.getProblem());
		statement.setString(7, appoint.getStatus());
		statement.setString(8,appoint.getDoctor());
		
	statement.executeUpdate();
	statement=connection.prepareStatement(QueryMapper.getId);
	resultSet=statement.executeQuery();
	resultSet.next();
	 id=resultSet.getInt(1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return id;
}

	

}
