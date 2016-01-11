package com.artivisi.halo.spring.ioc;

public class ProdukDao {
    private KoneksiDatabase koneksi;

    public ProdukDao(){}
    
    public ProdukDao(KoneksiDatabase koneksi) {
        this.koneksi = koneksi;
    }

    public void setKoneksi(KoneksiDatabase koneksi) {
        this.koneksi = koneksi;
    }
    
    public void simpan(){
        System.out.println("Menyimpan produk ke database "+koneksi.getNamaDatabase());
    }
}
