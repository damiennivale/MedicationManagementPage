package com.example.medicationmanagementpage;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class ActivityChooseMedicationType extends AppCompatActivity {


    private EditText medicationName, dosage, frequency;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_medication_type);


        // Initialize input fields
        medicationName = findViewById(R.id.medicationName);
        dosage = findViewById(R.id.dosage);
        frequency = findViewById(R.id.frequency);


        // Handle "Set" button click
        Button setButton = findViewById(R.id.setButton);
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = medicationName.getText().toString();
                String medDosage = dosage.getText().toString();
                String medFrequency = frequency.getText().toString();


                if (name.isEmpty() || medDosage.isEmpty() || medFrequency.isEmpty()) {
                    // Display error if any field is empty
                    Toast.makeText(ActivityChooseMedicationType.this, "Please fill out all fields!", Toast.LENGTH_SHORT).show();
                } else {
                    // Optionally store the data for further use (e.g., in a database or pass it back via Intent)


                    // Redirect back to ActivityMedicationManagement
                    Intent intent = new Intent(ActivityChooseMedicationType.this, ActivityMedicationManagement.class);
                    startActivity(intent);
                }
            }
        });


        // Handling the medication type buttons
        ImageButton pillButton = findViewById(R.id.pillButton);
        pillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // You can add code here to select pill as the medication type if needed
            }
        });


        // Similar onClick listeners can be added for other buttons (capsule, fluid, injection)
    }
}
