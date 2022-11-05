package com.example.a4khalifa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abubakar(View view) {
        Intent intent=new Intent(MainActivity.this,AbuBakarSiddiq.class);
        startActivity(intent);
    }

    public void umorebnul(View view) {
        Intent intent=new Intent(MainActivity.this,Umor.class);
        startActivity(intent);
    }

    public void usmanibn(View view) {
        Intent intent=new Intent(MainActivity.this,Usman.class);
        startActivity(intent);
    }

    public void aliibn(View view) {
        Intent intent=new Intent(MainActivity.this,Ali.class);
        startActivity(intent);
    }

    public void abt(View view) {
        Intent intent=new Intent(MainActivity.this,About.class);
        startActivity(intent);
    }
}