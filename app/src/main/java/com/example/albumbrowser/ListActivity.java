package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.albumbrowser.Adaptors.ItemsAdapter;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ItemsAdapter itemsAdapter = null;
        Intent intent = getIntent();

        if (intent.getStringExtra("type").equals("Vinyl")) {
            itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getItems("Vinyl"));
        } else if (intent.getStringExtra("type").equals("CD")) {
            itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getItems("CD"));
        } else if (intent.getStringExtra("type").equals("Cassette")) {
            itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getItems("Cassette"));
        }
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}