package com.edu.project1.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.edu.project1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DasboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dasboard_activity);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        return true;
                    case R.id.importproduct:
                        startActivity(new Intent(DasboardActivity.this, ImportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.exportpproduct:
                        startActivity(new Intent(DasboardActivity.this, ExportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.reportproduct:
                        startActivity(new Intent(DasboardActivity.this, ReportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.logout:
                        startActivity(new Intent(DasboardActivity.this, LogoutActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }
}