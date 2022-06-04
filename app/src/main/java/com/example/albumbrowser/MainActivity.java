package com.example.albumbrowser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static LinearLayoutManager linearLayoutManager;
    private static RecyclerViewAdapter recyclerViewAdapter;
    private static List<RecyclerViewItem> recentlyViewedList;
    private static List<RecyclerViewItem> addItemsToRVL;
    private static Context context;

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

    static ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vh = new ViewHolder();

        context = getBaseContext();

        recentlyViewedList = new LinkedList<RecyclerViewItem>();
        addItemsToRVL = new LinkedList<RecyclerViewItem>();
        recyclerViewAdapter = new RecyclerViewAdapter(this, recentlyViewedList, new RecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(RecyclerViewItem recyclerViewItem) {
                String type = recyclerViewItem.getAlbumType();
                String name = recyclerViewItem.getAlbumName();

                Intent detailsActivity = new Intent (getBaseContext(), DetailsActivity.class);
                detailsActivity.putExtra("type", type);
                detailsActivity.putExtra("name", name);
                startActivity(detailsActivity);
            }
        });
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

    public static String getKeyword() {
        return vh.searchBar.getText().toString();
    }

    public static void addRecentlyViewed(RecyclerViewItem recyclerViewItem) {
        Iterator<RecyclerViewItem> iterator = addItemsToRVL.iterator();
        String type = recyclerViewItem.getAlbumType();
        String name = recyclerViewItem.getAlbumName();

        if (addItemsToRVL.isEmpty()) {
            addItemsToRVL.add(recyclerViewItem);
        } else {
            while (iterator.hasNext()){
                RecyclerViewItem item = iterator.next();
                if (item.getAlbumType().equals(type) && item.getAlbumName().equals(name)){
                    addItemsToRVL.remove(item);
                    break;
                }
            }
            addItemsToRVL.add(recyclerViewItem);
        }
    }

    public static void changeRecentlyViewed() {
        Iterator<RecyclerViewItem> iterator1 = addItemsToRVL.iterator();
        Iterator<RecyclerViewItem> iterator2 = recentlyViewedList.iterator();

        if (!addItemsToRVL.isEmpty()) {
            while (iterator1.hasNext()){
                RecyclerViewItem itemToAdd = iterator1.next();
                String type = itemToAdd.getAlbumType();
                String name = itemToAdd.getAlbumName();
                while (iterator2.hasNext()) {
                    RecyclerViewItem checkItem = iterator2.next();
                    if (checkItem.getAlbumType().equals(type) && checkItem.getAlbumName().equals(name)){
                        recentlyViewedList.remove(checkItem);
                        break;
                    }
                }
                recentlyViewedList.add(0, itemToAdd);
            }
            addItemsToRVL.clear();
            vh.recyclerView.setLayoutManager(linearLayoutManager);
            vh.recyclerView.setAdapter(recyclerViewAdapter);
        }

    }

}