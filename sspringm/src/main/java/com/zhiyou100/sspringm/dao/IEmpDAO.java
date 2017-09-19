package com.zhiyou100.sspringm.dao;

import java.util.List;

import com.zhiyou100.sspringm.vo.Emp;

public interface IEmpDAO {

	public boolean doCreate(Emp vo);
	
	public boolean doRemove(Integer empno);
	
	public boolean doUpdate(Emp vo);
	
	public Emp findById(Integer empno);
	
	public List<Emp> findAll();
	
	public long findAllCount();
	
	public List<Emp> findAllSplit(String column, String keyword, int currPage, int lineSize);
	
	public long findAllSplitCount(String column, String keyword);
}
