package com.example.whatsup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: App up and running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Pausing the app");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Now resuming the application");
    }
}