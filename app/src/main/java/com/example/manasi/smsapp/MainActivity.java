package com.example.manasi.smsapp;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private EditText t1,t2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.b);
        t1 = (EditText) findViewById(R.id.ph);
        t2 = (EditText)findViewById(R.id.msg);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendSmsMsg();
                Toast.makeText(getApplicationContext(),"SENT SMS",Toast.LENGTH_SHORT).show();
            }

        });
    }

    protected void sendSmsMsg() {
        s1 = t1.getText().toString();
        s2 = t2.getText().toString();

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+919791270407",null,s2,null,null);
        return;
    }
}
