package com.artivisi.halo.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:halo-spring.xml");
        KoneksiDatabase k = ctx.getBean(KoneksiDatabase.class);
        
        System.out.println("Server : "+k.getServer());
        System.out.println("Port : "+k.getPort());
        System.out.println("Nama DB : "+k.getNamaDatabase());
        System.out.println("Username : "+k.getUsername());
        System.out.println("Password : "+k.getPassword());
        
        ProdukDao p = (ProdukDao) ctx.getBean("produkDao");
        p.simpan();
    }
}
