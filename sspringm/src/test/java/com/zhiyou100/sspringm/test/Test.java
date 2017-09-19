package com.zhiyou100.sspringm.test;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class Test {

	public static void main(String[] args) {
		ContextLoaderListener cll;
		
		CharacterEncodingFilter cef;
		
		MaxUploadSizeExceededException musee; 
		
		ResourceBundleMessageSource rbms;
		
		InternalResourceViewResolver irvr;
	}
}
