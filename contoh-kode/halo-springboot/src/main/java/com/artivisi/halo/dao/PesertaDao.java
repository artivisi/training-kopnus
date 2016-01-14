package com.artivisi.halo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.artivisi.halo.entity.Peserta;

public interface PesertaDao extends PagingAndSortingRepository<Peserta, String>{

	@Query("select p from Peserta p where upper(p.institusi.nama) like '%' || upper(:nama) || '%')")
	List<Peserta> cariPesertaByNamaInstitusi(@Param("nama") String nama);
	
}
