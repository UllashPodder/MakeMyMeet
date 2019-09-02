package com.podder.ullash.makemymeet;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.podder.ullash.makemymeet.LandingPages.MainNavigationActivity;
import com.podder.ullash.makemymeet.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
    }

}
