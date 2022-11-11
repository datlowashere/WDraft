package com.edu.project1.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.edu.project1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.logout);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(LogoutActivity.this, DasboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.importproduct:
                        startActivity(new Intent(LogoutActivity.this, ImportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.exportpproduct:
                        startActivity(new Intent(LogoutActivity.this, ExportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.reportproduct:
                        startActivity(new Intent(LogoutActivity.this, ReportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.logout:

                        return true;


                }
                return false;
            }
        });
    }
}