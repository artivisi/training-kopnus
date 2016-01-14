package com.artivisi.halo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.artivisi.halo.HaloSpringbootApplication;
import com.artivisi.halo.entity.Peserta;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HaloSpringbootApplication.class)
@Transactional
@SqlGroup({
	@Sql("insert-sample-institusi.sql"),
	@Sql("insert-sample-materi.sql"),
	@Sql("insert-sample-peserta.sql"),
	@Sql("insert-sample-kelas.sql")
})
public class PesertaDaoTests {
	
	@Autowired private PesertaDao pesertaDao;
	
	@Test
	public void testCariPesertaByNamaInstitusi(){
		String nama = "artivisi";
		List<Peserta> hasil = pesertaDao.cariPesertaByNamaInstitusi(nama);
		Assert.assertNotNull(hasil);
		Assert.assertEquals(4, hasil.size());
	}
}
