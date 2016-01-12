package com.artivisi.halo.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TransactionAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Begin transaction");
		Object hasil = invocation.proceed();
		System.out.println("Commit transaction");
		return hasil;
	}	
}
