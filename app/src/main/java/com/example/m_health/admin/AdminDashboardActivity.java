// app/src/main/java/com/example/m_health/admin/AdminDashboardActivity.java
package com.example.m_health.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.m_health.R;

public class AdminDashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // Initialize card views
        CardView cardUserManagement = findViewById(R.id.cardUserManagement);
        CardView cardPatientDatabase = findViewById(R.id.cardPatientDatabase);
        CardView cardSystemMonitoring = findViewById(R.id.cardSystemMonitoring);

        // Set click listeners
        cardUserManagement.setOnClickListener(this);
        cardPatientDatabase.setOnClickListener(this);
        cardSystemMonitoring.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        
        switch (view.getId()) {
            case R.id.cardUserManagement:
                intent = new Intent(this, UserManagementActivity.class);
                startActivity(intent);
                break;
                
            case R.id.cardPatientDatabase:
                intent = new Intent(this, PatientDatabaseActivity.class);
                startActivity(intent);
                break;
                
            case R.id.cardSystemMonitoring:
                intent = new Intent(this, SystemMonitoringActivity.class);
                startActivity(intent);
                break;
        }
    }
}