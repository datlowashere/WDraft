package com.edu.project1.Models;

public class TypeItems {
    private int maLoaiHang;
    private String tenLoaiHang,username;

    public TypeItems() {
    }

    public TypeItems(int maLoaiHang, String tenLoaiHang, String username) {
        this.maLoaiHang = maLoaiHang;
        this.tenLoaiHang = tenLoaiHang;
        this.username = username;
    }

    public int getMaLoaiHang() {
        return maLoaiHang;
    }

    public void setMaLoaiHang(int maLoaiHang) {
        this.maLoaiHang = maLoaiHang;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
