package com.example.madaim.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MyApp.MY_TAG, "MainActivity: onDestroy event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MyApp.MY_TAG, "MainActivity: onStop event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MyApp.MY_TAG, "MainActivity: onPause event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MyApp.MY_TAG, "MainActivity: onResume event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MyApp.MY_TAG, "MainActivity: onStart event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MyApp.MY_TAG, "MainActivity: onRestart event");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MyApp.MY_TAG, "MainActivity: onCreate event");
        setContentView(R.layout.activity_main);
    }

    public void desplayMessage(View view){
        EditText ed = (EditText) findViewById(R.id.enterName);
        String name = ed.getText().toString();
        String message = getResources().getString(R.string.emptyName);
        String realMessage = getResources().getString(R.string.firstName);
        if (name.isEmpty())
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, String.format(realMessage, name), Toast.LENGTH_LONG).show();
    }
}
