package com.example.albumbrowser.Models;

public class DetailsImages {
    String albumImage1, albumImage2, albumImage3;

    public DetailsImages(String albumImage1, String albumImage2, String albumImage3) {
        this.albumImage1 = albumImage1;
        this.albumImage2 = albumImage2;
        this.albumImage3 = albumImage3;
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
