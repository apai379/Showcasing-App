package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.albumbrowser.Adaptors.ItemsAdapter;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getItems());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}