package com.artivisi.halo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "kelas")
public class Kelas {
	@Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@Column(unique = true, nullable = false)
	private String kode;
	
	@Column(nullable = false)
	private String nama;
	
	@Column(nullable = false, name = "tanggal_mulai")
	@Temporal(TemporalType.DATE)
	private Date tanggalMulai;
	@Column(nullable = false, name = "tanggal_selesai")
	@Temporal(TemporalType.DATE)
	private Date tanggalSelesai;
	
	@OneToMany(mappedBy="kelas", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<KelasDetailMateri> daftarMateri = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(
		name = "peserta_kelas",
		joinColumns = @JoinColumn(name = "id_kelas"), 
		inverseJoinColumns = @JoinColumn(name = "id_peserta")
	)
	private List<Peserta> daftarPeserta = new ArrayList<>();
}
