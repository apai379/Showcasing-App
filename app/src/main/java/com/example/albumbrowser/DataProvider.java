package com.example.albumbrowser;

import com.example.albumbrowser.Models.Items;

import java.util.LinkedList;
import java.util.List;

public class DataProvider {
    private String[] albumName = {"After Hours", "The Dark Side Of The Moon", "After Hours", "The Dark Side Of The Moon",
    "After Hours", "The Dark Side Of The Moon"};

    private String[] albumType = {"Vinyl", "Vinyl", "CD", "CD", "Cassette", "Cassette"};

    private String[] albumArtist = {"The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd"};

    private String[] albumGenre = {"R&B, New Wave, Dream Pop", "Progressive Rock, Psychedelic", "R&B, New Wave, Dream Pop",
    "Progressive Rock, Psychedelic", "R&B, New Wave, Dream Pop", "Progressive Rock, Psychedelic"};

    private int[] albumRating = {80, 91, 80, 91, 80, 91};

    private int[] albumPrice = {45, 65, 45, 65, 45, 65};

    private int[] albumReleaseYear = {2020, 1973, 2020, 1973, 2020, 1973};


    public List<Items> getItems(String albumType) {
        List<Items> itemsList = new LinkedList<Items>();
        for (int i = 0; i < albumType.length(); i++) {
            if (this.albumType[i] == albumType) {
                String itemAlbumName = albumName[i];
                String itemAlbumArtist = albumArtist[i];
                String itemAlbumGenre = albumGenre[i];
                int itemAlbumPrice = albumPrice[i];
                Items item = new Items(albumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumPrice);
                itemsList.add(item);
            }
        }
        return itemsList;
    }

}
