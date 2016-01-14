package com.artivisi.halo.dao;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
import com.artivisi.halo.entity.Kelas;

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
	
	@Autowired private KelasDao kelasDao;
	
	@Test
	public void testCariKelasBerdasarkanNama(){
		String nama = "web";
		List<Kelas> hasil = kelasDao.findByNamaIgnoreCaseContaining(nama);
		Assert.assertNotNull(hasil);
		Assert.assertEquals(1, hasil.size());
	}
	
	@Test
	public void testCariKelasBerdasarkanTanggalMulai(){
		Date mulai = Date.from(LocalDate.parse("2015-10-10")
						.atStartOfDay()
						.atZone(ZoneId.systemDefault())
						.toInstant());
		Date sampai = Date.from(LocalDate.parse("2016-02-01")
				.plusMonths(1)
				.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant());
		
		List<Kelas> hasil = kelasDao.findByTanggalMulaiBetween(mulai, sampai);
		Assert.assertNotNull(hasil);
		Assert.assertEquals(2, hasil.size());
		
		Date mulai2 = Date.from(LocalDate.parse("2016-03-01")
				.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant());
		
		Date sampai2 = Date.from(LocalDate.parse("2016-10-01")
				.plusMonths(1)
				.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant());
				
		List<Kelas> hasil2 = kelasDao.findByTanggalMulaiBetween(mulai2, sampai2);
		Assert.assertNotNull(hasil2);
		Assert.assertTrue(hasil2.isEmpty());
	}
		
	@Test
	public void testCariKelasYangDihadiriPesertaDenganNama(){
		List<Kelas> hasil = kelasDao.cariKelasYangDihadiriPesertaDenganNama("adi");
		Assert.assertNotNull(hasil);
		Assert.assertEquals(2, hasil.size());
		
		List<Kelas> hasil2 = kelasDao.cariKelasYangDihadiriPesertaDenganNama("endy");
		Assert.assertNotNull(hasil2);
		Assert.assertEquals(1, hasil2.size());
	}
}
