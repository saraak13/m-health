package com.example.m_health;

import android.content.Intent;
import android.os.Bundle;


import com.example.m_health.admin.AdminDashboardActivity;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Temporary: Add a button or auto-navigate to admin dashboard
        startActivity(new Intent(this, AdminDashboardActivity.class));
        finish();
    }
}