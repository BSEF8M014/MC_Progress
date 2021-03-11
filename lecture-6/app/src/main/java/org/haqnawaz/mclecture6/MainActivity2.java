package org.haqnawaz.mclecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Call(View view)
    {
        Uri uri= Uri.parse("tel:+923225563815");
        Intent intent=new Intent (Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
    public void showWebsite(View view)
    {
        Uri uri= Uri.parse("http://www.pucit.edu.pk");
        Intent intent=new Intent (Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}