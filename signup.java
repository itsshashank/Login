package com.sj.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by shashank on 7/10/2017.
 */

public class signup extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void reg(View v)
    {
        Intent in1= new Intent(this,reg.class);
        startActivity(in1);
    }
}
