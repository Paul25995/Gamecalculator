package com.example.gamecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.gamecalculator.eco.Eco;
import com.example.gamecalculator.satisfactory.Satisfactory;

public class MainActivity extends AppCompatActivity {

    private ImageButton ecoButton;
    private ImageButton satisfactoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecoButton = (ImageButton) findViewById(R.id.ecoButton);
        satisfactoryButton = (ImageButton) findViewById(R.id.satisfactoryButton);
        ecoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEcoActivity();
            }
        });
        satisfactoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSatisfactoryActivity();
            }
        });
    }
    public void openEcoActivity() {
        Intent intent = new Intent(this, Eco.class);
        startActivity(intent);
    }
    public void openSatisfactoryActivity() {
        Intent intent = new Intent(this, Satisfactory.class);
        startActivity(intent);
    }
}