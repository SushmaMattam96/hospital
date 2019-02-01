package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.bean.appointment;
import com.cg.dao.HspDao;
import com.cg.dao.HspDaoImp;
import com.cg.exception.HspException;

public class HmsServiceImp implements HmsService {
HspDao dao=new HspDaoImp();
	@Override
	public boolean validate(appointment appoint) {
		boolean flag=false;
		List<String> list=new ArrayList<String>();
		if(!checkname(appoint.getName())){
			list.add("NAME MUST");
		}
		if(!checknum(appoint.getPhone()))
			list.add("");
	   if(!checkemail(appoint.getEmail()))
			list.add("");
	   if(!list.isEmpty())
		   System.out.println(list);
	   else
		   flag=true;
		return true;
	

}

	private boolean checkemail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checknum(Long phone) {
	String numRegEx = "[6|7|8|9]{1}[0-9]{9}";
		return Pattern.matches(numRegEx, phone.toString());
	}

	private boolean checkname(String name) {
		String nameRegEx = "[A-Z]{1}[a-z]{5,10}$";
		return Pattern.matches(nameRegEx, name);
	}

	@Override
	public int insert(appointment appoint) throws HspException {
		// TODO Auto-generated method stub
		return dao.insert(appoint);
	}
}
