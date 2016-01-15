package com.artivisi.halo.dao;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.artivisi.halo.HaloSpringbootApplication;
import com.artivisi.halo.entity.Institusi;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HaloSpringbootApplication.class)
@Transactional
@Sql(scripts="insert-sample-institusi.sql")
public class InstitusiDaoTests {
	
	@Autowired
	private InstitusiDao institusiDao;
	
	@BeforeClass
	public static void inisialisiKelas(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void bersihBersihKelas(){
		System.out.println("After Class");
	}

	@Before
	public void inisialisiMethod(){
		System.out.println("Before Method");
	}
	
	@After
	public void bersihBersihMethod(){
		System.out.println("After Method");
	}
	
	@Test
	public void testCariById(){
		Institusi x = institusiDao.findOne("artivisi");
		// harusnya ada record dengan id artivisi
		Assert.assertNotNull(x);
		
		// kalau id tersebut tidak ada di database, harusnya null
		Assert.assertNull(institusiDao.findOne("xyz"));
	}
	
	@Test
	public void testHitungRecord(){
		Assert.assertEquals(2L, institusiDao.count());
	}
	
	@Test
	public void testFindAll(){
		Institusi i = institusiDao.findAll().iterator().next();
		Assert.assertEquals("ArtiVisi Intermedia", i.getNama());
		Assert.assertEquals("123", i.getNpwp());
	}
	
	@Test
	public void testSimpan(){
		Institusi i = new Institusi();
		i.setKode("T-001");
		i.setNama("Institusi Test");
		
		Assert.assertNull(i.getId());
		institusiDao.save(i);
		Assert.assertNotNull(i.getId());
	}
	
	@Test
	public void testPaging(){
		Page<Institusi> hasilQuery = institusiDao.findAll(new PageRequest(0, 10));
		Assert.assertNotNull(hasilQuery);
		Assert.assertEquals(1, hasilQuery.getTotalPages());
		Assert.assertEquals(2, hasilQuery.getTotalElements());
		Assert.assertEquals(2, hasilQuery.getNumberOfElements());
		Assert.assertEquals(0, institusiDao.findAll(new PageRequest(1, 10)).getNumberOfElements());
	}
}
