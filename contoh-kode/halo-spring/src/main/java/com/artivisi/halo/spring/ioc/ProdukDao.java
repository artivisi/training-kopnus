package com.artivisi.halo.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdukDao {
    
    @Autowired
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
