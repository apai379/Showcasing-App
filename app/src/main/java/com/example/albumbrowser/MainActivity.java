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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static LinearLayoutManager linearLayoutManager;
    private static RecyclerViewAdapter recyclerViewAdapter;
    private static List<RecyclerViewItem> recentlyViewedList;
    private static List<RecyclerViewItem> addItemsToRVL;

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

        recentlyViewedList = new LinkedList<RecyclerViewItem>();
        addItemsToRVL = new LinkedList<RecyclerViewItem>();

        changeRecentlyViewed();

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

    public static String getKeyword() {
        return vh.searchBar.getText().toString();
    }

    public static void addRecentlyViewed(RecyclerViewItem recyclerViewItem) {
        Iterator<RecyclerViewItem> iterator = addItemsToRVL.iterator();
        String type = recyclerViewItem.getAlbumType();
        String name = recyclerViewItem.getAlbumName();

        while (iterator.hasNext()){
            RecyclerViewItem item = iterator.next();
            if (item.getAlbumType().equals(type) && item.getAlbumName().equals(name)){
                addItemsToRVL.remove(item);
                break;
            }
            addItemsToRVL.add(item);
        }
    }

    public static void changeRecentlyViewed() {
        Iterator<RecyclerViewItem> iterator1 = addItemsToRVL.iterator();
        Iterator<RecyclerViewItem> iterator2 = recentlyViewedList.iterator();

        while (iterator1.hasNext()){
            RecyclerViewItem itemToAdd = iterator1.next();
            String type = itemToAdd.getAlbumType();
            String name = itemToAdd.getAlbumName();
            while (iterator2.hasNext()) {
                RecyclerViewItem checkItem = iterator1.next();
                if (checkItem.getAlbumType().equals(type) && checkItem.getAlbumName().equals(name)){
                    recentlyViewedList.remove(checkItem);
                    break;
                }
            }
            recentlyViewedList.add(itemToAdd);
        }
        addItemsToRVL.clear();
    }

}