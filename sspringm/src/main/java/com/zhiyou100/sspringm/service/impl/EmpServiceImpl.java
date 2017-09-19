package com.zhiyou100.sspringm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou100.sspringm.dao.IEmpDAO;
import com.zhiyou100.sspringm.dao.impl.EmpDAOImpl;
import com.zhiyou100.sspringm.service.IEmpService;
import com.zhiyou100.sspringm.vo.Emp;

@Service
public class EmpServiceImpl implements IEmpService {

	@Resource
	private IEmpDAO empDao;
	
	@Override
	public boolean add(Emp vo) throws Exception {
		return empDao.doCreate(vo);
	}

}
