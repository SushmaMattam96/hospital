package com.cg.dao;

import com.cg.bean.appointment;
import com.cg.exception.HspException;

public interface HspDao {

	

	int insert(appointment appoint) throws HspException;

}
