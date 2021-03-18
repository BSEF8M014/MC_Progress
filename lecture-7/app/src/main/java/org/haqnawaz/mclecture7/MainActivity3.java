package org.haqnawaz.mclecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC2","onStart called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC2","onResume called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC2","onDestroy called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC2","onPause called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC2","onStop called");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ALC2","onCreate called");
    }
}