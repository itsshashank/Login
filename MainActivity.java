package com.sj.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)  findViewById(R.id.login);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"lets see the toaste",Toast.LENGTH_SHORT).show();
                Intent in= new Intent(MainActivity.this,log.class);
                startActivity(in);
            }
        });
        b1=(Button)  findViewById(R.id.sign);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in1= new Intent(MainActivity.this,reg.class);
                startActivity(in1);
            }
        });


    }


}
