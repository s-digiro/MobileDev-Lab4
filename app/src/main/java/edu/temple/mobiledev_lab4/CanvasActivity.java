package edu.temple.mobiledev_lab4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceStats) {
        super.onCreate(savedInstanceStats);
        setContentView(R.layout.activity_canvas);
        Intent intent = this.getIntent();
        this.findViewById(R.id.layout).setBackgroundColor(intent.getIntExtra("COLOR", 0));
    }
}
