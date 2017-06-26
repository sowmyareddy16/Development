package com.training.explicitdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=(TextView)findViewById(R.id.textView2);

        Intent intent=getIntent();

        Bundle bundle=intent.getExtras();

        String name=bundle.getString("Name");
        textView.setText("Hello"+name);
    }
}
