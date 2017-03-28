package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CalculateDao;
import com.test.model.Calculate;
import com.test.service.CalculateService;
@Service
public class CalculateServiceImpl implements CalculateService {
	@Autowired
	CalculateDao calculateDO;
	@Override
	public void calculate(Calculate cal) {
		// TODO Auto-generated method stub
		 calculateDO.saveCalculateInfo(cal);
	}

	
	
}
