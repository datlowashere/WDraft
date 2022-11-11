package com.edu.project1.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.edu.project1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ImportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.import_activity);


        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.importproduct);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(ImportActivity.this, DasboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.importproduct:
                        return true;
                    case R.id.exportpproduct:
                        startActivity(new Intent(ImportActivity.this, ExportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.reportproduct:
                        startActivity(new Intent(ImportActivity.this, ReportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.logout:
                        startActivity(new Intent(ImportActivity.this, LogoutActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }
}