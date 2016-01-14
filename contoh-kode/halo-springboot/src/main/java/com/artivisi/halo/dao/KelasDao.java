package com.artivisi.halo.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.artivisi.halo.entity.Kelas;

public interface KelasDao extends PagingAndSortingRepository<Kelas, String> {

	List<Kelas> findByNamaIgnoreCaseContaining(String nama);

	List<Kelas> findByTanggalMulaiBetween(Date mulai, Date sampai);

	List<Kelas> findByTanggalMulaiBetween(LocalDate mulai, LocalDate sampai);
	
}
