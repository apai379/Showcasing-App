package com.example.albumbrowser.Models;

public class Details {
    String albumType, albumName, albumArtist, albumGenre, albumPrice, albumRating, albumReleaseYear;
    String albumImage1, albumImage2, albumImage3;

    public Details(String albumType, String albumName, String albumArtist, String albumGenre, String albumPrice,
                   String albumRating, String albumReleaseYear) {
        this.albumType = albumType;
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumGenre = albumGenre;
        this.albumPrice = albumPrice;
        this.albumRating = albumRating;
        this.albumReleaseYear = albumReleaseYear;
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

    public String getAlbumPrice() {
        return "$" + albumPrice;
    }

    public String getAlbumRating() {
        return albumRating;
    }

    public String getAlbumReleaseYear() {
        return albumReleaseYear;
    }

}
