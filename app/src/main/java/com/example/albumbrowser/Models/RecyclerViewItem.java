package com.example.albumbrowser.Models;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewItem{
    String albumType, albumName, albumPrice, albumIcon;

    public RecyclerViewItem(String albumType, String albumName, String albumPrice, String albumIcon) {
        this.albumType = albumType;
        this.albumName = albumName;
        this.albumPrice = albumPrice;
        this.albumIcon = albumIcon;
    }

    public String getAlbumType() {
        return albumType;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumPrice() {
        return "$" + albumPrice;
    }

    public String getAlbumIcon() {
        return albumIcon;
    }
}
