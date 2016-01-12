package com.artivisi.halo.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuditLogAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation inv) throws Throwable {
		String namaMethod = inv.getMethod().getName();
		System.out.println("Nama method : "+namaMethod);
		Object[] argumen = inv.getArguments();
		for (Object arg : argumen) {
			System.out.println("Argumen : "+arg);
		}
		Object hasil = inv.proceed();
		System.out.println("Mencatat user, workstation, nama method, waktu eksekusi");
		return hasil;
	}

}
