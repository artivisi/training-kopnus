insert into kelas (id, kode, nama, tanggal_mulai, tanggal_selesai) values 
('abc', 'JWB-001', 'Java Web Basic', '2016-01-01', '2016-01-05');

insert into kelas_detail_materi (id, id_kelas, id_materi, urutan) values 
('x001', 'abc', 'jfu-001', 1);

insert into kelas_detail_materi (id, id_kelas, id_materi, urutan) values 
('x002', 'abc', 'jfu-002', 2);

insert into kelas_detail_materi (id, id_kelas, id_materi, urutan) values 
('x003', 'abc', 'jsi-001', 3);

insert into peserta_kelas (id_kelas, id_peserta) values 
('abc', 'dadang');

insert into peserta_kelas (id_kelas, id_peserta) values 
('abc', 'adi');

insert into peserta_kelas (id_kelas, id_peserta) values 
('abc', 'jimmy');

insert into kelas (id, kode, nama, tanggal_mulai, tanggal_selesai) values 
('xyz', 'JWB-002', 'Spring Framework', '2016-02-01', '2016-02-05');

insert into kelas_detail_materi (id, id_kelas, id_materi, urutan) values 
('x101', 'abc', 'jsi-001', 1);

insert into kelas_detail_materi (id, id_kelas, id_materi, urutan) values 
('x102', 'abc', 'jsi-002', 2);

insert into peserta_kelas (id_kelas, id_peserta) values 
('xyz', 'adi');

insert into peserta_kelas (id_kelas, id_peserta) values 
('xyz', 'endy');
