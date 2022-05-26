package com.example.albumbrowser.Models;

public class Items {
    String albumType, albumName, albumArtist, albumGenre, albumIcon;
    int albumPrice;

    public Items(String albumType, String albumName, String albumArtist, String albumGenre, String albumIcon, int albumPrice) {
        this.albumType = albumType;
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumGenre = albumGenre;
        this.albumIcon = albumIcon;
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

    public String getAlbumIcon() { return albumIcon; }

    public int getAlbumPrice() {
        return albumPrice;
    }
}
