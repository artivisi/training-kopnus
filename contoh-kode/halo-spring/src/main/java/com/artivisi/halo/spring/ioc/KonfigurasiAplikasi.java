package com.artivisi.halo.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.artivisi.halo.spring")
@PropertySource("classpath:jdbc.properties")
public class KonfigurasiAplikasi {
    
    @Autowired
    private Environment env;
    
    @Bean
    public KoneksiDatabase buatKoneksi(){
        KoneksiDatabase k = new KoneksiDatabase();
        k.setServer(env.getProperty("server"));
        k.setPort(Integer.parseInt(env.getProperty("port")));
        k.setNamaDatabase(env.getProperty("namaDatabase"));
        k.setUsername(env.getProperty("username"));
        k.setPassword(env.getProperty("password"));
        
        return k;
    }
}
