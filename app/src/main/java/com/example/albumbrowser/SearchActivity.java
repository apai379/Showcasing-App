package com.example.albumbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.albumbrowser.Adaptors.ItemsAdapter;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ItemsAdapter itemsAdapter = null;
        Intent intent = getIntent();

        itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getItems(intent.getStringExtra("type")));
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
