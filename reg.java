package com.sj.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Console;

/**
 * Created by shash on 7/11/2017.
 */

public class reg extends AppCompatActivity{
    EditText name,email,no,add,pw;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);
        name =(EditText) findViewById(R.id.name);
        email =(EditText) findViewById(R.id.email);
        no =(EditText) findViewById(R.id.mob);
        add =(EditText) findViewById(R.id.add);
        pw =(EditText) findViewById(R.id.pw);
    }
    public void val(View v)
    {

        Toast.makeText(this,"Sucessfully Registered now Login",Toast.LENGTH_SHORT).show();
        Intent in= new Intent(this,log.class);
        startActivity(in);
    }

}
