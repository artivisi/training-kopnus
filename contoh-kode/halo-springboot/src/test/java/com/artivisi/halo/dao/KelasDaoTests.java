package com.artivisi.halo.dao;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.artivisi.halo.HaloSpringbootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HaloSpringbootApplication.class)
@Transactional
@SqlGroup({
	@Sql("insert-sample-institusi.sql"),
	@Sql("insert-sample-materi.sql"),
	@Sql("insert-sample-peserta.sql"),
	@Sql("insert-sample-kelas.sql")
})
public class KelasDaoTests {
	
	@Test
	public void testCariKelas(){
		System.out.println("Test cari kelas");
	}
}
