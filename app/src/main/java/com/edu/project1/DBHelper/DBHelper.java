package com.edu.project1.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="Project1";
    public static final int DB_VERSION=1;
    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTBUser="create table User(" +
                "username text primary key," +
                "hoTen text," +
                "email text," +
                "tenKhoHang text," +
                "password text)";
        String createTBLoaiHang="create table LoaiHang(" +
                "maLoaiHang integer primary key autoincrement," +
                "tenLoaiHang text," +
                "username text references User(username))";
        String createTBNhapHang="create table NhapHang(" +
                "maNhapHang integer primary key autoincrement," +
                "tenHang text," +
                "tenLoaiHang text," +
                "soLuongNhap integer," +
                "donGia float," +
                "ngayNhapHang date," +
                "ngaySanXuat date," +
                "maLoaiHang integer references LoaiHang(maLoaiHang))";
        String createTBXuatHang="create table XuatHang(" +
                "maXuatHang integer primary key autoincrement," +
                "tenHang text," +
                "tenLoaiHang text," +
                "soLuongNhap integer," +
                "soLuongXuat integer," +
                "donGia float," +
                "donGiaXuat float," +
                "ngayXuatHang date," +
                "maNhapHang integer references NhapHang(maNhapHang))";
        db.execSQL(createTBUser);
        db.execSQL(createTBLoaiHang);
        db.execSQL(createTBNhapHang);
        db.execSQL(createTBXuatHang);

        db.execSQL("insert into User values('admin','Đạt Lô','datlowashere@gmail.com','Kho thực phẩm','admin')");
        db.execSQL("insert into User values('abc','Ngọc Giản','giannt@gmail.com','Kho Gìay','abc')");
        db.execSQL("insert into User values('xyz','Liam XD','liamxdd@gmail.com','Kho Thuốc','xyz')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropUser="drop table  if exists User";
        String dropLoaiHang="drop table  if exists LoaiHang";
        String dropNhapHang="drop table  if exists NhapHang";
        String dropXuatHang="drop table  if exists XuatHang";
        db.execSQL(dropUser);
        db.execSQL(dropLoaiHang);
        db.execSQL(dropNhapHang);
        db.execSQL(dropXuatHang);
        onCreate(db);



    }
}
