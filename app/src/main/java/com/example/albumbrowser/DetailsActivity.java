package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.albumbrowser.Adaptors.DetailsImageAdaptor;
import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Adaptors.RecyclerViewImageAdaptor;
import com.example.albumbrowser.Models.Details;
import com.example.albumbrowser.Models.RecyclerViewImage;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.LinkedList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    DetailsImageAdaptor detailsImageAdaptor;

    class ViewHolder {
        ViewPager viewPager;
        TextView albumType, albumName, albumArtist, albumGenre, albumPrice, albumRating, albumReleaseYear;

        public ViewHolder(){
            viewPager = findViewById(R.id.image_slider);
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

        vh.viewPager = findViewById(R.id.image_slider);
        detailsImageAdaptor = new DetailsImageAdaptor(this, DataProvider.getImages(type, name));
        vh.viewPager.setAdapter(detailsImageAdaptor);

        RecyclerViewItem recyclerViewItem = DataProvider.getRecyclerViewItem(type, name);
        MainActivity.addRecentlyViewed(recyclerViewItem);
        MainActivity.changeRecentlyViewed();

    }
}