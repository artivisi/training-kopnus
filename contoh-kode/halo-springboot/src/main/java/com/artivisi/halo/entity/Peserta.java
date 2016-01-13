package com.artivisi.halo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Peserta {
	@Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@Column(unique = true, nullable = false)
	private String kode;
	
	@Column(nullable = false)
	private String nama;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(name = "tanggal_lahir")
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;
	
	
}
