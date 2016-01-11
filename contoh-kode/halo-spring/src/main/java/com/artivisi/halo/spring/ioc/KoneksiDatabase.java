package com.artivisi.halo.spring.ioc;

public class KoneksiDatabase {
    private String server;
    private Integer port;
    private String namaDatabase;
    private String username;
    private String password;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getNamaDatabase() {
        return namaDatabase;
    }

    public void setNamaDatabase(String namaDatabase) {
        this.namaDatabase = namaDatabase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
