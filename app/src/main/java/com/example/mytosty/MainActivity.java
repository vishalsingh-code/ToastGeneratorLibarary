package com.example.mytosty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tosty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.SimpleToast(this,"My first Android library");
    }

}