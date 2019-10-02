package edu.temple.mobiledev_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner color = findViewById(R.id.spinner);
        final ColorAdapter adapter = new ColorAdapter(this);
        color.setAdapter(adapter);

        color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int i = 0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.WHITE);
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("COLOR", adapter.getColor(position));
                if (i > 0) {
                    PaletteActivity.this.startActivity(intent);
                }
                i++;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                parent.setBackgroundColor(Color.RED);
            }
        });
    }
}
