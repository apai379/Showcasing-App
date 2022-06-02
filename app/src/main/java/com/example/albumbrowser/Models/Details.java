package com.example.albumbrowser.Models;

public class Details {
    String albumType, albumName, albumArtist, albumGenre, albumPrice, albumRating, albumReleaseYear;

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
        return "Type: " + albumType;
    }

    public String getAlbumName() {
        return "Name: " + albumName;
    }

    public String getAlbumArtist() {
        return "Artist: " + albumArtist;
    }

    public String getAlbumGenre() {
        return "Genre: " + albumGenre;
    }

    public String getAlbumPrice() {
        return "Price: $" + albumPrice;
    }

    public String getAlbumRating() {
        return "Rating: " + albumRating;
    }

    public String getAlbumReleaseYear() {
        return "Release Year: " + albumReleaseYear;
    }

}
