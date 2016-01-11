package com.artivisi.halo.spring.ioc;

public class NoSpringDemo {
    public static void main(String[] args) {
        KoneksiDatabase k = new KoneksiDatabase();
        k.setServer("localhost");
        k.setPort(1234);
        k.setNamaDatabase("belajar");
        k.setUsername("admin");
        k.setPassword("123");
        
        System.out.println("Server : "+k.getServer());
        System.out.println("Port : "+k.getPort());
        System.out.println("Nama DB : "+k.getNamaDatabase());
        System.out.println("Username : "+k.getUsername());
        System.out.println("Password : "+k.getPassword());
        
        ProdukDao pd = new ProdukDao();
        pd.setKoneksi(k);
        pd.simpan();
    }
}
