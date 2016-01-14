package com.artivisi.halo.controller;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.artivisi.halo.HaloSpringbootApplication;
import com.artivisi.halo.dao.InstitusiDao;
import com.artivisi.halo.entity.Institusi;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HaloSpringbootApplication.class)
@Sql(scripts="../dao/insert-sample-institusi.sql")
@WebIntegrationTest
public class InstitusiControllerTests {
	
	private RestTemplate httpClient = new TestRestTemplate();
	private String url = "http://localhost:9090/institusi/";
	
	@Autowired private InstitusiDao institusiDao;
	
	@After
	public void hapusSampleData(){
		institusiDao.delete("artivisi");
	}
	
	@Test
	public void testGetSemuaData() {
		Map<String, Object> hasil = httpClient.getForObject(url, Map.class);
		Assert.assertNotNull(hasil);
		System.out.println("Total Elements : "+hasil.keySet());
		Assert.assertEquals(Long.valueOf(1), 
				Long.valueOf(hasil.get("totalElements").toString()));
		
	}
	
	@Test
	public void testGetById(){
		Institusi i = httpClient.getForObject(url+"artivisi", Institusi.class);
		Assert.assertNotNull(i);
		Assert.assertEquals("ArtiVisi Intermedia", i.getNama());
		
		Assert.assertNull(httpClient.getForObject(url+"xyz", Institusi.class));
	}
}
