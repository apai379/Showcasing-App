package com.example.albumbrowser.Models;

public class Details {
    String albumType, albumName, albumArtist, albumGenre, albumPrice, albumRating, albumReleaseYear;
    String albumImage1, albumImage2, albumImage3;

    public Details(String albumType, String albumName, String albumArtist, String albumGenre, String albumPrice,
                   String albumRating, String albumReleaseYear, String albumImage1, String albumImage2, String albumImage3) {
        this.albumType = albumType;
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.albumGenre = albumGenre;
        this.albumPrice = albumPrice;
        this.albumRating = albumRating;
        this.albumReleaseYear = albumReleaseYear;
        this.albumImage1 = albumImage1;
        this.albumImage2 = albumImage2;
        this.albumImage3 = albumImage3;
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

    public String getAlbumImage1() {
        return albumImage1;
    }

    public String getAlbumImage2() {
        return albumImage2;
    }

    public String getAlbumImage3() {
        return albumImage3;
    }
}
