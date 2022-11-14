package com.edu.project1.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.edu.project1.DBHelper.DBHelper;
import com.edu.project1.Models.InventoryItems;

import java.util.List;

public class ReportDao {
    private SQLiteDatabase db;
    private List<InventoryItems> list;

    public ReportDao(Context context) {
        DBHelper dbHelper=new DBHelper(context);
        db=dbHelper.getWritableDatabase();
    }

}
