package com.example.albumbrowser.Models;

public class Items {
    String albumType, albumName, albumArtist, albumGenre;
    int albumPrice;

    public Items(String albumType, String albumName, String albumArtist, String albumGenre, int albumPrice) {
        this.albumType = albumType;
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumGenre = albumGenre;
        this.albumPrice = albumPrice;
    }

    public String getAlbumType() {
        return albumType;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public String getAlbumGenre() {
        return albumGenre;
    }

    public int getAlbumPrice() {
        return albumPrice;
    }
}
