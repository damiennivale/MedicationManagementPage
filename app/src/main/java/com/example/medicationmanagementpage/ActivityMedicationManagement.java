package com.example.medicationmanagementpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMedicationManagement extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication_management); // Link to the XML layout

        // Find the ImageView for back arrow navigation to ChooseMedicationTypeActivity
        ImageView backArrow = findViewById(R.id.arrow_back_button);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ActivityChooseMedicationType
                Intent intent = new Intent(ActivityMedicationManagement.this, ActivityChooseMedicationType.class);
                startActivity(intent);
            }
        });

        // Find the ImageView for navigation to Reminder page
        ImageView arrowToReminder = findViewById(R.id.backButtonFromReminder);
        arrowToReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ActivityReminder
                Intent intent = new Intent(ActivityMedicationManagement.this, ActivityReminder.class);
                startActivity(intent);
            }
        });
    }
}
