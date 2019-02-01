package com.cg.service;

import com.cg.bean.appointment;
import com.cg.exception.HspException;

public interface HmsService {

	boolean validate(appointment appoint);

	

	int insert(appointment appoint) throws HspException;


}
