package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Adaptors.RecyclerViewImageAdaptor;
import com.example.albumbrowser.Models.Details;
import com.example.albumbrowser.Models.RecyclerViewImage;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.LinkedList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    RecyclerViewImageAdaptor recyclerViewImageAdapter;
    List<RecyclerViewImage> recyclerViewImages;

    class ViewHolder {
        RecyclerView recyclerView;
        TextView albumType, albumName, albumArtist, albumGenre, albumPrice, albumRating, albumReleaseYear;

        public ViewHolder(){
            //recyclerView = findViewById(R.id.recyclerview_details);
            albumType = findViewById(R.id.details_type);
            albumName = findViewById(R.id.details_name);
            albumArtist = findViewById(R.id.details_artist);
            albumGenre = findViewById(R.id.details_genre);
            albumPrice = findViewById(R.id.details_price);
            albumRating = findViewById(R.id.details_rating);
            albumReleaseYear = findViewById(R.id.details_year);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        vh = new ViewHolder();

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        String name = intent.getStringExtra("name");

        Details details = DataProvider.getDetails(type, name);

        vh.albumType.setText(details.getAlbumType());
        vh.albumName.setText(details.getAlbumName());
        vh.albumArtist.setText(details.getAlbumArtist());
        vh.albumGenre.setText(details.getAlbumGenre());
        vh.albumPrice.setText(details.getAlbumPrice());
        vh.albumRating.setText(details.getAlbumRating());
        vh.albumReleaseYear.setText(details.getAlbumReleaseYear());

        recyclerViewImageAdapter = new RecyclerViewImageAdaptor(this, DataProvider.getRecyclerViewImages(type, name));
        vh.recyclerView = findViewById(R.id.recyclerview_details);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        vh.recyclerView.setLayoutManager(linearLayoutManager);
        vh.recyclerView.setAdapter(recyclerViewImageAdapter);

//        RecyclerViewItem recyclerViewItem = DataProvider.getRecyclerViewItem(type, name);
//        MainActivity.changeRecentlyViewed(recyclerViewItem);

    }
}