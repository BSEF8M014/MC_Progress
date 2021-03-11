package org.haqnawaz.mclecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Uri uri= Uri.parse("tel:+923225563815");
        Intent intent=new Intent (Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
}