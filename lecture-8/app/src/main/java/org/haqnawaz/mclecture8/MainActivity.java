package org.haqnawaz.mclecture8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> friendArrayList;
    ArrayAdapter<String> arrayAdapter;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.myListView);
        button = findViewById(R.id.btnAdd);
        editText = findViewById(R.id.editTextAdd);
        String [] friendList = {"Ayman", "Sameen", "Maryam", "Asma"};
        friendArrayList = new ArrayList<String>();

        friendArrayList.add("Naima");
        friendArrayList.add("Fatima");
        friendArrayList.add("Wajeeha");
        friendArrayList.add("Malaika");
        friendArrayList.add("Aleena");
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, friendArrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            Log.d ("you clicked",friendArrayList.get(i));
            Intent intend = new Intent(MainActivity.this, MainActivity2.class);
            intend.putExtra("Friend Name", friendArrayList.get(i));
            startActivity(intend);
            }
            });
    }

    public void AddFriend(View view) {
        friendArrayList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
        listView.setAdapter(arrayAdapter);
        Collections.sort(friendArrayList);
    }
}









