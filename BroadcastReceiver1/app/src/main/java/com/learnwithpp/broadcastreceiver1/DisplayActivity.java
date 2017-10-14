package com.learnwithpp.broadcastreceiver1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        textView = (TextView) findViewById(R.id.textView);
        String number = getIntent().getStringExtra("mobile_number");
        textView.setText(String.valueOf(number));
    }
}
