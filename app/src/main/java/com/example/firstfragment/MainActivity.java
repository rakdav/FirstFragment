package com.example.firstfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.super_content);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,ContentFragment.class,null).
                    commit();
        }
    }
}