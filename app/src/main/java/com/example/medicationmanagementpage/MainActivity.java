package com.example.medicationmanagementpage;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable Edge-to-Edge support (keeps the UI consistent with modern Android)
        EdgeToEdge.enable(this);

        // Set the layout of MainActivity
        setContentView(R.layout.activity_main);



        // Launch ActivityMedicationManagement as soon as MainActivity is created
        Intent intent = new Intent(MainActivity.this, ActivityMedicationManagement.class);
        startActivity(intent);
        finish();  // Close MainActivity so the user doesn't return to it
    }
}
