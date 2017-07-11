package com.sj.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by shash on 7/11/2017.
 */

public class home extends AppCompatActivity{
    Button b;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        b=(Button)  findViewById(R.id.p);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(home.this,"going to profile",Toast.LENGTH_SHORT).show();
                Intent in= new Intent(home.this,profile.class);
                startActivity(in);
            }
        });
    }
    public void editp(View v)
    {
        Intent i=new Intent(this,reg.class);
        startActivity(i);
    }


}
