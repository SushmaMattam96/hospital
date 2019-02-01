package com.cg.dao;

public interface QueryMapper {

	


	String insert ="insert into patient values(id_seq.nextval,?,?,sysdate+1,?,?,?,?,?,?)";
	
	public static final String getId = "select id_seq.currval from dual";	

}
