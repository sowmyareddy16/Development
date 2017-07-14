package com.example.konda.aidl2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first, second;
    Button button;
    TextView textView;
    First first1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById(R.id.editText);
        second = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = new Intent(MainActivity.this, MyService.class);
        bindService(intent, connection, Context.BIND_AUTO_CREATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstno = Integer.parseInt(first.getText().toString());
                int secondno = Integer.parseInt(second.getText().toString());
                try {
                    int result = first1.basicTypes(firstno, secondno);
                    textView.setText(result+"");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }



            }

        });
    }

        ServiceConnection connection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                first1 = First.Stub.asInterface(service);
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
    }

