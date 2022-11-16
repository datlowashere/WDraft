package com.edu.project1.Models;

import java.util.Date;

public class ImportItems {

    private int maNhapHang,soLuongNhap,maLoaiHang;
    private float donGia;
    private String tenHang,tenLoaiHang,username;
    private Date ngaySanXuat,ngayNhapHang;

    public ImportItems() {
    }

    public ImportItems(int maNhapHang, int soLuongNhap, int maLoaiHang, float donGia, String tenHang, String tenLoaiHang, String username, Date ngaySanXuat, Date ngayNhapHang) {
        this.maNhapHang = maNhapHang;
        this.soLuongNhap = soLuongNhap;
        this.maLoaiHang = maLoaiHang;
        this.donGia = donGia;
        this.tenHang = tenHang;
        this.tenLoaiHang = tenLoaiHang;
        this.username = username;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayNhapHang = ngayNhapHang;
    }

    public int getMaNhapHang() {
        return maNhapHang;
    }

    public void setMaNhapHang(int maNhapHang) {
        this.maNhapHang = maNhapHang;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getMaLoaiHang() {
        return maLoaiHang;
    }

    public void setMaLoaiHang(int maLoaiHang) {
        this.maLoaiHang = maLoaiHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
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

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(Date ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }
}
