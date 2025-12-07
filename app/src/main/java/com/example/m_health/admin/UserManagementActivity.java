// app/src/main/java/com/example/m_health/admin/UserManagementActivity.java
package com.example.m_health.admin;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m_health.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class UserManagementActivity extends AppCompatActivity {

    private RecyclerView recyclerViewUsers;
    private UserAdapter userAdapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_management);

        // Initialize views
        recyclerViewUsers = findViewById(R.id.recyclerViewUsers);
        FloatingActionButton fabAddUser = findViewById(R.id.fabAddUser);

        // Setup RecyclerView
        recyclerViewUsers.setLayoutManager(new LinearLayoutManager(this));
        userList = new ArrayList<>();
        
        // Add sample data (replace with actual data from your database)
        userList.add(new User("admin@example.com", "Administrateur", "Admin"));
        userList.add(new User("doctor1@example.com", "Dr. Smith", "Médecin"));
        userList.add(new User("nurse1@example.com", "Infirmière Marie", "Infirmier"));

        userAdapter = new UserAdapter(userList);
        recyclerViewUsers.setAdapter(userAdapter);

        // Set click listeners
        fabAddUser.setOnClickListener(v -> showAddUserDialog());

          userAdapter.setOnMoreButtonClickListener((view, position) -> {
        showUserActionsMenu(view, position);
    });
    }

    private void showAddUserDialog() {
        // TODO: Implement add user dialog
    }
    private void showUserActionsMenu(View view, int position) {
    PopupMenu popup = new PopupMenu(this, view);
    popup.inflate(R.menu.menu_user_actions);
    popup.setOnMenuItemClickListener(item -> {
        if (item.getItemId() == R.id.action_edit) {
            // Handle edit action
            return true;
        } else if (item.getItemId() == R.id.action_delete) {
            // Handle delete action
            return true;
        }
        return false;
    });
    popup.show();
}
}