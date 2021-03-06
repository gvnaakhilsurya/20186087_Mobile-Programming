package com.example.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {


//    private String url = "http://msitmp.herokuapp.com/getproducts/20186087";
    private static String data;
//    private ArrayList<Product> t = new ArrayList<>();
    private Button login, register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestQueue queue = Volley.newRequestQueue(this);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);


        Paper.init(this);


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);

            }
        });


        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }

    }




}
