package com.artivisi.halo.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SecurityAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation inv) throws Throwable {
		System.out.println("Mengecek user dan permission");
		/*
		User u = ambilDariSession();
		if(u == null){
			throw new BelumLoginException();
		}
		
		String role = u.getRole();
		if(!role.equals("admin")) {
			throw new PermissionKurangException();
		}
		*/
		return inv.proceed();
	}

}
