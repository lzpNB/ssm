package com.zhiyou100.sspringm.test;


import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.sspringm.service.IEmpService;
import com.zhiyou100.sspringm.util.DateUtil;
import com.zhiyou100.sspringm.vo.Emp;

import junit.framework.TestCase;

public class EmpServiceImplTest {
	private static ApplicationContext myCtx = null;
	private static Integer empno ;
	private Logger log = Logger.getLogger(EmpServiceImplTest.class);
	static {
		empno = new Random().nextInt(10000);
		myCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testAdd() throws Exception {
		IEmpService service = myCtx.getBean("empServiceImpl", IEmpService.class);
		Emp vo = new Emp();
		vo.setEmpno(empno);
		vo.setDeptno(new Random().nextInt(100));
		vo.setEname("小刚" + empno);
		vo.setJob("程序员");
		vo.setSal((double) Math.round(new Random().nextDouble()*30000));
		vo.setComm((double) Math.round(new Random().nextDouble()*50000));
		vo.setMgr(new Random().nextInt(10000));
		Date date = DateUtil.randomDate("1997-08-21", "2017-08-21", 3650*2).get(0);
		vo.setHiredate(date);
		vo.setCreateTime(date);
		boolean flag = service.add(vo);
		TestCase.assertTrue(flag);
		log.info(flag);
	}

}
