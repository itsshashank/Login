package com.sj.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by shashank on 7/10/2017.
 */

public class log extends AppCompatActivity
{   EditText us,pw;
    SharedPreferences sp;
    SharedPreferences.Editor se;
    Button b;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);
        us=(EditText) findViewById(R.id.user);
        pw=(EditText) findViewById(R.id.pw);
        b=(Button)  findViewById(R.id.p);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(log.this,home.class);
                startActivity(in);
            }
        });
    }
}
