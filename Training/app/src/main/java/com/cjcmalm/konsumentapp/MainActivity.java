package com.cjcmalm.konsumentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareOnFacebook(View view) {

        Intent intent = new Intent(this,ShareOnFacebookActivity.class);
        startActivity(intent);

    }
}
