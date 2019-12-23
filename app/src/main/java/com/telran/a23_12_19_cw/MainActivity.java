package com.telran.a23_12_19_cw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.myList);
        MyAdapter adapter = new MyAdapter(this);
        listView.setAdapter(adapter);

        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(v -> {
            adapter.add(new Person("Person", 23));
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Person p = (Person) adapter.getItem(position);
            Toast.makeText(this, p.name + " " + position, Toast.LENGTH_SHORT).show();
        });
    }
}
