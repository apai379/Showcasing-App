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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static LinearLayoutManager linearLayoutManager;
    private static RecyclerViewAdapter recyclerViewAdapter;
    private static List<RecyclerViewItem> mostViewedList;
    private static Map<RecyclerViewItem, Integer> viewedItems;
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

        mostViewedList = new ArrayList<RecyclerViewItem>();
        mostViewedList.add(DataProvider.getRecyclerViewItem("Vinyl", "After Hours"));
        mostViewedList.add(DataProvider.getRecyclerViewItem("CD", "The Dark Side Of The Moon"));
        mostViewedList.add(DataProvider.getRecyclerViewItem("Cassette", "Thriller"));
        mostViewedList.add(DataProvider.getRecyclerViewItem("Vinyl", "Abbey Road"));
        mostViewedList.add(DataProvider.getRecyclerViewItem("Vinyl", "Thriller"));

        viewedItems = new LinkedHashMap<RecyclerViewItem, Integer>();
        viewedItems.put(DataProvider.getRecyclerViewItem("Vinyl", "After Hours"), 0);
        viewedItems.put(DataProvider.getRecyclerViewItem("CD", "The Dark Side Of The Moon"), 0);
        viewedItems.put(DataProvider.getRecyclerViewItem("Cassette", "Thriller"), 0);
        viewedItems.put(DataProvider.getRecyclerViewItem("Vinyl", "Abbey Road"), 0);
        viewedItems.put(DataProvider.getRecyclerViewItem("Vinyl", "Thriller"), 0);

        recyclerViewAdapter = new RecyclerViewAdapter(this, mostViewedList, new RecyclerViewAdapter.ItemClickListener() {
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

//    public static void addRecentlyViewed(RecyclerViewItem recyclerViewItem) {
//        Iterator<RecyclerViewItem> iterator = itemsViewed.iterator();
//        String type = recyclerViewItem.getAlbumType();
//        String name = recyclerViewItem.getAlbumName();
//
//        if (itemsViewed.isEmpty()) {
//            itemsViewed.add(recyclerViewItem);
//        } else {
//            while (iterator.hasNext()){
//                RecyclerViewItem item = iterator.next();
//                if (item.getAlbumType().equals(type) && item.getAlbumName().equals(name)){
//                    itemsViewed.remove(item);
//                    break;
//                }
//            }
//            itemsViewed.add(recyclerViewItem);
//        }
//    }
//
//    public static void changeRecentlyViewed() {
//        Iterator<RecyclerViewItem> iterator1 = itemsViewed.iterator();
//        Iterator<RecyclerViewItem> iterator2 = mostViewedList.iterator();
//
//        if (!itemsViewed.isEmpty()) {
//            while (iterator1.hasNext()){
//                RecyclerViewItem itemToAdd = iterator1.next();
//                String type = itemToAdd.getAlbumType();
//                String name = itemToAdd.getAlbumName();
//                while (iterator2.hasNext()) {
//                    RecyclerViewItem checkItem = iterator2.next();
//                    if (checkItem.getAlbumType().equals(type) && checkItem.getAlbumName().equals(name)){
//                        mostViewedList.remove(checkItem);
//                        break;
//                    }
//                }
//                mostViewedList.add(0, itemToAdd);
//            }
//            itemsViewed.clear();
//            vh.recyclerView.setLayoutManager(linearLayoutManager);
//            vh.recyclerView.setAdapter(recyclerViewAdapter);
//        }
//
//    }

    public static void changeMostViewed(RecyclerViewItem recyclerViewItem) {
        String type = recyclerViewItem.getAlbumType();
        String name = recyclerViewItem.getAlbumName();
        RecyclerViewItem itemInList = null;
        int viewCount = 1;
        Boolean alreadyViewed = Boolean.FALSE;

        for (RecyclerViewItem item : viewedItems.keySet()) {
            if (item.getAlbumType().equals(type) && item.getAlbumName().equals(name)) {
                viewCount = viewedItems.get(item);
                viewCount = viewCount + 1;
                viewedItems.remove(item);
                viewedItems.put(recyclerViewItem, viewCount);
                itemInList = item;
                alreadyViewed = Boolean.TRUE;
                break;
            }
        }

        if (!alreadyViewed) {
            viewedItems.put(recyclerViewItem, viewCount);
            itemInList = recyclerViewItem;
        }

        for (int i = 0; i < mostViewedList.size(); i++) {
            if (viewedItems.get(itemInList) >= viewedItems.get(mostViewedList.get(i))) {
                mostViewedList.add(i, recyclerViewItem);
                mostViewedList.remove(mostViewedList.size() - 1);
                break;
            }
        }

    }

}