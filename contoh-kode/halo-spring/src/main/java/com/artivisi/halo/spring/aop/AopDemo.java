package com.artivisi.halo.spring.aop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:spring-aop-demo.xml");
		
		BankService bs = (BankService) ctx.getBean("bankService");
		bs.setor("12345", new BigDecimal(100000));
	}
}
