CREATE TABLE institusi (
    id character varying(255) NOT NULL,
    alamat character varying(255),
    kode character varying(255) NOT NULL,
    nama character varying(255) NOT NULL,
    telepon character varying(255),
    website character varying(255),
    npwp character varying(255)
);

ALTER TABLE ONLY institusi
    ADD CONSTRAINT institusi_pkey PRIMARY KEY (id);

CREATE TABLE materi (
    id character varying(255) NOT NULL,
    kode character varying(255) NOT NULL,
    nama character varying(255) NOT NULL
);

ALTER TABLE ONLY materi
    ADD CONSTRAINT materi_pkey PRIMARY KEY (id);

CREATE TABLE peserta (
    id character varying(32) NOT NULL,
    email character varying(100) NOT NULL,
    kode character varying(20) NOT NULL,
    nama character varying(255) NOT NULL,
    tanggal_lahir date NOT NULL,
    id_institusi character varying(32) NOT NULL
);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT peserta_pkey PRIMARY KEY (id);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT unique_email UNIQUE (email);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT unique_kode UNIQUE (kode);
    
ALTER TABLE ONLY peserta
    ADD CONSTRAINT fk_peserta_institusi FOREIGN KEY (id_institusi) REFERENCES institusi(id);

CREATE TABLE kelas (
    id character varying(255) NOT NULL,
    kode character varying(255) NOT NULL,
    nama character varying(255) NOT NULL,
    tanggal_mulai date NOT NULL,
    tanggal_selesai date NOT NULL
);

ALTER TABLE ONLY kelas
    ADD CONSTRAINT kelas_pkey PRIMARY KEY (id);


CREATE TABLE kelas_detail_materi (
    id character varying(255) NOT NULL,
    urutan integer NOT NULL,
    id_kelas character varying(255) NOT NULL,
    id_materi character varying(255) NOT NULL
);

ALTER TABLE ONLY kelas_detail_materi
    ADD CONSTRAINT kelas_detail_materi_pkey PRIMARY KEY (id);

ALTER TABLE ONLY kelas_detail_materi
    ADD CONSTRAINT fk_d6stndhfo7mflkn0gfxegi2wt FOREIGN KEY (id_kelas) REFERENCES kelas(id);

CREATE TABLE peserta_kelas (
    id_kelas character varying(255) NOT NULL,
    id_peserta character varying(255) NOT NULL
);

ALTER TABLE ONLY peserta_kelas
    ADD CONSTRAINT fk_ljwebqf06fc596bni5ld08q06 FOREIGN KEY (id_peserta) REFERENCES peserta(id);

ALTER TABLE ONLY peserta_kelas
    ADD CONSTRAINT fk_qlxkao8288kbbw1pcobcbyomk FOREIGN KEY (id_kelas) REFERENCES kelas(id);
