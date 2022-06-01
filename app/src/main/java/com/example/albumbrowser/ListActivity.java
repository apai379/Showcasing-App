package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.albumbrowser.Adaptors.ItemsAdapter;

import java.util.LinkedList;
import java.util.List;

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
        } else
            itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, DataProvider.getSearchedItems(intent.getStringExtra("type")));

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView name = findViewById(R.id.items_listview_albumName);
                TextView type = findViewById(R.id.items_listview_albumType);

                Intent detailsActivity = new Intent (getBaseContext(), DetailsActivity.class);
                detailsActivity.putExtra("type", type.getText().toString());
                detailsActivity.putExtra("name", name.getText().toString());
                startActivity(detailsActivity);
            }
        });

    }
}