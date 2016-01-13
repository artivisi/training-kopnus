CREATE TABLE peserta (
    id character varying(32) NOT NULL,
    email character varying(100) NOT NULL,
    kode character varying(20) NOT NULL,
    nama character varying(255) NOT NULL,
    tanggal_lahir date NOT NULL
);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT peserta_pkey PRIMARY KEY (id);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT unique_email UNIQUE (email);

ALTER TABLE ONLY peserta
    ADD CONSTRAINT unique_kode UNIQUE (kode);