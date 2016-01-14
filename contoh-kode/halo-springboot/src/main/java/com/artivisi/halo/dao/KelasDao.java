package com.artivisi.halo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.artivisi.halo.entity.Kelas;

public interface KelasDao extends PagingAndSortingRepository<Kelas, String> {

	List<Kelas> findByNamaIgnoreCaseContaining(String nama);

	List<Kelas> findByTanggalMulaiBetween(Date mulai, Date sampai);

	@Query(
		value="select * from kelas "
				+ "inner join peserta_kelas on kelas.id = peserta_kelas.id_kelas "
				+ "inner join peserta on peserta_kelas.id_peserta = peserta.id "
				+ "where upper(peserta.nama) like '%' || upper(:nama) || '%'",
		nativeQuery = true
	)
	List<Kelas> cariKelasYangDihadiriPesertaDenganNama(@Param("nama") String nama);
	
}
