package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button frag_first;
    Button frag_second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_first=findViewById(R.id.button1);
        frag_second=findViewById(R.id.button2);

        frag_first.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                transactionFragment(new Fragment_first());
            }

        });

        frag_second.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                transactionFragment(new Fragment_second());
            }

        });
    }

    public void transactionFragment(Fragment fragment){

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }
}