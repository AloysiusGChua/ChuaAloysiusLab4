package com.chua.aloysius;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        Log.d("4ITG", "onCreate() has executed ...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG", "onStart() has executed ...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG", "onResume() has executed ...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG", "onPause() has executed ...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG", "onStop() has executed() ...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG", "onRestart() has executed ...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has executed ...");
    }

    public void showMessageToast(View v){
        Toast.makeText(this, "Bye Palawan", Toast.LENGTH_LONG).show();
    }

    public void showMessageSnack(View v){
        Snackbar.make(v, "Welcome to Palawan", Snackbar.LENGTH_LONG).show();
    }
}
