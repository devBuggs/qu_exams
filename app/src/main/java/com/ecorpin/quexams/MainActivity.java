package com.ecorpin.quexams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation header_anim;

    Button discoverBtn;
    Button erpBtn;
    Button examBtn;
    Button resultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // getWindow method is used to cover the entire screen for display the layout's
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //this will bind our MainActivity.class file with activity_main
        setContentView(R.layout.activity_main);

        // Animation effect
        ImageView header = (ImageView) findViewById(R.id.app_header);

        header_anim = AnimationUtils.loadAnimation(this, R.anim.up_to_down_anim);
        header.setAnimation(header_anim);

        discoverBtn = (Button) findViewById(R.id.discover);
        discoverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discoverWeb.class);
                intent.putExtra("url", "http://quantumuniversity.edu.in/");
                startActivity(intent);
            }
        });

        erpBtn = (Button) findViewById(R.id.erp);
        erpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discoverWeb.class);
                intent.putExtra("url", "http://my.quantumuniversity.edu.in");
                startActivity(intent);
            }
        });

        examBtn = (Button) findViewById(R.id.exam);
        examBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discoverWeb.class);
                intent.putExtra("url", "http://exams.quantum.edu.in/");
                startActivity(intent);
            }
        });

        resultBtn = (Button) findViewById(R.id.result);
        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), discoverWeb.class);
                intent.putExtra("url", "http://quantum.edu.in/results");
                startActivity(intent);
            }
        });



    }

}
