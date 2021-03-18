package org.haqnawaz.mclecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC1","onResume called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC1","onDestroy called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC1","onPause called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC1","onStop called");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("ALC1","onCreate called");
    }

    public void MoveToActivity3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}