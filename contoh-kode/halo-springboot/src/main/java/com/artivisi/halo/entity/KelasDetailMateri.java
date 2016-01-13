package com.artivisi.halo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "kelas_detail_materi")
public class KelasDetailMateri {
	@Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@ManyToOne
	@JoinColumn(name="id_materi", nullable=false)
	private Materi materi;
	
	@ManyToOne
	@JoinColumn(name="id_kelas", nullable=false)
	private Kelas kelas;
	
	@Column(nullable = false)
	private Integer urutan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Materi getMateri() {
		return materi;
	}

	public void setMateri(Materi materi) {
		this.materi = materi;
	}

	public Kelas getKelas() {
		return kelas;
	}

	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}

	public Integer getUrutan() {
		return urutan;
	}

	public void setUrutan(Integer urutan) {
		this.urutan = urutan;
	}
	
	
}
