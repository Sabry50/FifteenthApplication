package com.example.fifteenthapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBarvalue);
        submit = findViewById(R.id.button_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = String.valueOf(ratingBar.getRating());
                Toast.makeText( IslamMainActivity.this,x+"Star",Toast.LENGTH_LONG).show();
            }
        });

    }
}
