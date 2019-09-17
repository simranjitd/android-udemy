package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Login(View view){

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText= (EditText) findViewById(R.id.passwordEditText);

        Log.i("username", usernameEditText.getText().toString());
        Log.i("password", passwordEditText.getText().toString());
        Log.i("info", "button pressed");

        String username1;
        username1= usernameEditText.getText().toString();

        Toast.makeText(this, "hi "+ username1, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
