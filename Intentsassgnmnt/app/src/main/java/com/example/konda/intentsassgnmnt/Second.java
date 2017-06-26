package com.example.konda.intentsassgnmnt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {
    TextView tv2;
    Button btn;
    RadioGroup rg;
    TextView tv3;
    RadioButton rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv2=(TextView)findViewById(R.id.textView5);
        btn=(Button)findViewById(R.id.button2);
        tv3=(TextView)findViewById(R.id.textView6);
        rg=(RadioGroup)findViewById(R.id.radiogroup) ;

        int y=rg.getCheckedRadioButtonId();
        rbutton=(RadioButton)findViewById(y);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String x =intent.getStringExtra(Intent.EXTRA_TEXT);
                tv2.setText(x);
                tv3.setText(rbutton.getText() );





            }
        });





            }

    }


