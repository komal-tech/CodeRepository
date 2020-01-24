package com.evolvus.SpringBatch;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.evolvus.SpringBatch.Model.Person;
	 
public class PersonMapper implements RowMapper {
	       public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
	              Person person = new Person();
	              person.setFirstname(rs.getString("firstName"));
	              person.setLastname(rs.getString("lastName"));
	              person.setSchool(rs.getString("school"));
	              person.setRollno(rs.getInt("rollNumber"));             
	              return person;
	           }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	

