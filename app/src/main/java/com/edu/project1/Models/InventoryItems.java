package com.edu.project1.Models;

public class InventoryItems {
    private String tenHang,tenLoai;
    private int soLuongTon;

    public InventoryItems() {
    }

    public InventoryItems(String tenHang, String tenLoai, int soLuongTon) {
        this.tenHang = tenHang;
        this.tenLoai = tenLoai;
        this.soLuongTon = soLuongTon;
    }

    public InventoryItems(String tenHang, int soLuongTon) {
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
}
