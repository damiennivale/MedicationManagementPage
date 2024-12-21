package com.example.medicationmanagementpage;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ActivityReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder); // Use activity_reminder.xml

        // Find the TextViews
        TextView todayTextView = findViewById(R.id.TVDay);
        TextView dateTimeTextView = findViewById(R.id.TVDateTime);

        // Get the current date and time
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.getDefault()); // Day (e.g., Sunday)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()); // Date (e.g., 11 December 2024)
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a", Locale.getDefault()); // Time (e.g., 10:30 AM)

        // Set the current day, date, and time
        String day = dayFormat.format(calendar.getTime());
        String date = dateFormat.format(calendar.getTime());
        String time = timeFormat.format(calendar.getTime());

        // Update the TextViews with current values
        todayTextView.setText(day);
        dateTimeTextView.setText(date + ", " + time); // Combine date and time

        // Set up the back arrow to handle back navigation
        ImageView backArrow = findViewById(R.id.backButtonFromReminder);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  // Go back to the previous activity
            }
        });
    }
}
