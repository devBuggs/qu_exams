package com.ecorpin.quexams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation header_anim;

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



    }

}
