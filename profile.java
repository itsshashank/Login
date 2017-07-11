package com.sj.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by shash on 7/11/2017.
 */

public class profile extends AppCompatActivity{
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

    }
    public void back(View v)
    {
        Intent in= new Intent(this,home.class);
        startActivity(in);
    }
}
