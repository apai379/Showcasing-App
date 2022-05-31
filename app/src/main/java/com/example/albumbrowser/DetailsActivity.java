package com.example.albumbrowser;

import com.example.albumbrowser.Models.*;
import java.*;
import java.util.List;

import java.util.LinkedList;

public class DetailsActivity {

    private String name, artist, genre = null;
    private int rating, price, releaseDate, views = 0;
    private String[] imageList = {};

    int i = 0;
    private List<Items> listOfAll = DataProvider.getItems(name);


    Items instance = listOfAll.get(i);

    public void setName() {
        this.name = instance.getAlbumName();
    }

    public void setArtist(){
        this.artist = instance.getAlbumArtist();
    }

    public void setGenre(){
        this.genre = instance.getAlbumGenre();
    }

    public void setPrice(){
        this.price = Integer.parseInt(instance.getAlbumPrice());
    }

    public void setRating(){
        this.rating = Integer.parseInt(instance.)
    }


    //
//    while (i < listOfAll.length()){
//        Items instance = listOfAll.get(i);
//        this.name = instance.getAlbumName();
//        this.artist = instance.getAlbumArtist();
//        this.genre = instance.getAlbumGenre();
//        //this.imageList = instance.getAlbumIcon();
//        //this.price = instance.getAlbumPrice();
//        //this.rating = instance.
//    }

}