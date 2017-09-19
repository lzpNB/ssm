package com.zhiyou100.sspringm.action;

import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou100.sspringm.service.IEmpService;
import com.zhiyou100.sspringm.vo.Emp;

@Controller
@Scope(scopeName="prototype")
@RequestMapping("/pages/emp/*")
public class EmpAction {
	Logger log = Logger.getLogger(EmpAction.class);
	
	@Resource
	private IEmpService empService;

	@RequestMapping("add") 
	public ModelAndView add(Emp vo){
		try {
			log.info("新增员工：" + empService.add(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(java.util.Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
