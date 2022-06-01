package com.example.albumbrowser;

import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Models.*;
import java.*;
import java.util.List;

import java.util.LinkedList;

public class DetailsActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    class ViewHolder {
        RecyclerView recyclerView;

        public ViewHolder(){
            recyclerView = findViewById(R.id.recyclerview_details);
        }
    }

    MainActivity.ViewHolder vh;



}

//
//    public void setName() {
//        this.name = instance.getAlbumName();
//    }
//
//    public void setArtist(){
//        this.artist = instance.getAlbumArtist();
//    }
//
//    public void setGenre(){
//        this.genre = instance.getAlbumGenre();
//    }
//
//    public void setPrice(){
//        this.price = Integer.parseInt(instance.getAlbumPrice());
//    }
//
