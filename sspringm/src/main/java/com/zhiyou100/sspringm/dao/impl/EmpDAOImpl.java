package com.zhiyou100.sspringm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.zhiyou100.sspringm.dao.IEmpDAO;
import com.zhiyou100.sspringm.vo.Emp;

@Repository
public class EmpDAOImpl implements IEmpDAO {

	@Resource
	private SqlSessionFactory factory;

	@Override
	public boolean doCreate(Emp vo) {
		return factory.openSession().insert(
				"com.zhiyou100.sspringm.vo.mapping.EmpNS.doCreate",
					vo) > 0;
	}

	@Override
	public boolean doRemove(Integer empno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Emp vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Emp findById(Integer empno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Emp> findAllSplit(String column, String keyword, int currPage, int lineSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findAllSplitCount(String column, String keyword) {
		// TODO Auto-generated method stub
		return 0;
	}

}
