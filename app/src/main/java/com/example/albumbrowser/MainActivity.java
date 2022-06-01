package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Models.RecyclerViewImage;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;
    List<RecyclerViewItem> recentlyViewedList;

    class ViewHolder {
        EditText searchBar;
        CardView cardviewVinyl, cardviewCD, cardviewCassette;
        RecyclerView recyclerView;
        ImageView searchButton;

        public ViewHolder(){
            searchBar = findViewById(R.id.search_bar);
            searchButton = findViewById(R.id.search_button);
            cardviewVinyl = findViewById(R.id.cardview_vinyl);
            cardviewCD = findViewById(R.id.cardview_cd);
            cardviewCassette = findViewById(R.id.cardview_cassette);
            recyclerView = findViewById(R.id.recyclerview);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vh = new ViewHolder();

        recentlyViewedList = new LinkedList<RecyclerViewItem>();

        recentlyViewedList.add(DataProvider.getRecyclerViewItem("Vinyl", "After Hours"));
        recentlyViewedList.add(DataProvider.getRecyclerViewItem("CD", "After Hours"));
        recentlyViewedList.add(DataProvider.getRecyclerViewItem("Cassette", "After Hours"));

        recyclerViewAdapter = new RecyclerViewAdapter(this, recentlyViewedList);

        vh.recyclerView = findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        vh.recyclerView.setLayoutManager(linearLayoutManager);
        vh.recyclerView.setAdapter(recyclerViewAdapter);

        vh.cardviewVinyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = "Vinyl";
                Intent listActivity = new Intent (getBaseContext(), ListActivity.class);

                listActivity.putExtra("type", value);
                startActivity (listActivity);
            }
        });

        vh.cardviewCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = "CD";
                Intent listActivity = new Intent (getBaseContext(), ListActivity.class);

                listActivity.putExtra("type", value);
                startActivity (listActivity);
            }
        });

        vh.cardviewCassette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = "Cassette";
                Intent listActivity = new Intent (getBaseContext(), ListActivity.class);

                listActivity.putExtra("type", value);
                startActivity (listActivity);
            }
        });

        vh.searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyword = getKeyword();
                Intent listActivity = new Intent (getBaseContext(), ListActivity.class);

                listActivity.putExtra("type", keyword);
                startActivity (listActivity);
            }
        });

    }

    public String getKeyword() {
        return vh.searchBar.getText().toString();
    }

}