package com.artivisi.halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HaloSpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaloSpringcloudApplication.class, args);
	}
}
