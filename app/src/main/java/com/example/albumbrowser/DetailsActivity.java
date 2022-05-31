package com.example.albumbrowser;

import com.example.albumbrowser.Models.*;
import java.*;
import java.util.List;

import java.util.LinkedList;

public class DetailsActivity<list> {

    private String name, artist, genre = null;
    private int rating, price, releaseDate, views = 0;
    private String[] imageList = {};

    private List<Items> listOfAll = DataProvider.getItems();

    int i = 0;
    while (i < listOfAll.length()){
        Items instance = listOfAll.get(i);
        this.name = instance.getAlbumName();
        this.artist = instance.getAlbumArtist();
        this.genre = instance.getAlbumGenre();
        //this.imageList = instance.getAlbumIcon();
        //this.price = instance.getAlbumPrice();
        //this.rating = instance.
    }

}