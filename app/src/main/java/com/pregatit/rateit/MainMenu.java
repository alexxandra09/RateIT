package com.pregatit.rateit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void OnAjutorClick(View v)
    {
        Intent i = new Intent(this, ajutorSelectie.class);
        startActivity(i);
    }
    public void OnLogOutClick(View v)
    {
        Intent i = new Intent(this, LoginPage.class);
        startActivity(i);
    }
}