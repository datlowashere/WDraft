package com.edu.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.edu.project1.Activities.ExportActivity;
import com.edu.project1.Activities.ImportActivity;
import com.edu.project1.Activities.LogoutActivity;
import com.edu.project1.Activities.ReportActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        return true;
                    case R.id.importproduct:
                        startActivity(new Intent(MainActivity.this, ImportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.exportpproduct:
                        startActivity(new Intent(MainActivity.this, ExportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.reportproduct:
                        startActivity(new Intent(MainActivity.this, ReportActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.logout:
                        startActivity(new Intent(MainActivity.this, LogoutActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });

    }
}