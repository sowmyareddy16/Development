package com.example.konda.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog=new Dialog(MainActivity.this);
                dialog.setTitle("custom dialog");
                dialog.setContentView(R.layout.custom);
                EditText name=(EditText)dialog.findViewById(R.id.editText);
                EditText email=(EditText)dialog.findViewById(R.id.editText2);
                Button button1=(Button)dialog.findViewById(R.id.button2);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}
