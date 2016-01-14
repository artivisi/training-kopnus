package com.artivisi.halo.controller;

import java.util.Map;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.artivisi.halo.HaloSpringbootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HaloSpringbootApplication.class)
@Transactional
@Sql(scripts="../dao/insert-sample-institusi.sql")
@WebIntegrationTest
public class InstitusiControllerTests {
	
	private RestTemplate httpClient = new TestRestTemplate();
	private String url = "http://localhost:9090/institusi";
	
	@Test
	public void testGetSemuaData() throws InterruptedException{
		
		Map<String, Object> hasil = httpClient.getForObject(url, Map.class);
		Assert.assertNotNull(hasil);
		System.out.println("Total Elements : "+hasil.get("totalElements"));
		Assert.assertEquals(Long.valueOf(1), 
				Long.valueOf(hasil.get("totalElements").toString()));
		
	}
}
