package com.basic.mvpdaggerretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.basic.mvpdaggerretrofit.ui.hive.HiveActivity;
import com.basic.mvpdaggerretrofit.ui.makeup.MakeupActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hiveButton = findViewById(R.id.hiveButton);

        hiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HiveActivity.class);
                startActivity(intent);
            }
        });
        Button makeupButton = findViewById(R.id.makeupButton);

        makeupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MakeupActivity.class);
                startActivity(intent);
            }
        });

    }
}
