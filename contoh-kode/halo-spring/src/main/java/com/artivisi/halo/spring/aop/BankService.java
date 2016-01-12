package com.artivisi.halo.spring.aop;

import java.math.BigDecimal;

public class BankService {
	public void setor(String rekening, BigDecimal jumlah){
		System.out.println("Setor "+jumlah+ " ke rekening "+rekening);		
	}
}
