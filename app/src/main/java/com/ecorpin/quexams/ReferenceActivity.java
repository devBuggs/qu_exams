package com.ecorpin.quexams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class ReferenceActivity extends AppCompatActivity {

    TextView appVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // getWindow method is used to cover the entire screen for display the layout's
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_reference);

        appVersion = (TextView) findViewById(R.id.appVersion);
        appVersion.setText(R.string.version);
    }
}
