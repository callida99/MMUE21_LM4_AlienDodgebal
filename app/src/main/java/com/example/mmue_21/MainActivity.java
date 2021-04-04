package com.example.mmue_21;

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

    public void exitButtonClicked(View view) {
        finish(); //close activity
    }

    public void startVideoActivity(View v) {
        startActivity(new Intent(this, VideoActivity.class));
    }


}