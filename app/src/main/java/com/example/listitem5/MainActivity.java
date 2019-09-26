package com.example.listitem5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.t1);
        gridView = findViewById(R.id.gr1);
        final String name[] = {"reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri", "reeta", "geeta", "jaya", "madhuri"};
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_items, R.id.t1, name);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "I love you"+"\t"+arrayAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
