package com.example.albumbrowser;

import com.example.albumbrowser.Models.Items;

import java.util.LinkedList;
import java.util.List;

public class DataProvider {
    private static String[] albumName = {"After Hours", "The Dark Side Of The Moon", "After Hours", "The Dark Side Of The Moon",
    "After Hours", "The Dark Side Of The Moon"};

    private static String[] albumType = {"Vinyl", "Vinyl", "CD", "CD", "Cassette", "Cassette"};

    private static String[] albumArtist = {"The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd"};

    private static String[] albumGenre = {"R&B, New Wave, Dream Pop", "Progressive Rock, Psychedelic", "R&B, New Wave, Dream Pop",
    "Progressive Rock, Psychedelic", "R&B, New Wave, Dream Pop", "Progressive Rock, Psychedelic"};

    private static String[] albumRating = {"80", "91", "80", "91", "80", "91"};

    private static String[] albumPrice = {"45", "65", "45", "65", "45", "65"};

    private static String[] albumReleaseYear = {"2020", "1973", "2020", "1973", "2020", "1973"};

    private static String[] albumImage1 = {"afterhours_vinyl1", "tdsotm_vinyl1", "afterhours_cd1", "tdsotm_cd1",
    "afterhours_cassette1", "tdsotm_cassette1"};


    public static List<Items> getItems() {
        List<Items> itemsList = new LinkedList<Items>();
        for (int i = 0; i < albumType.length; i++) {
            if (albumType[i] == "Vinyl") {
                String itemAlbumName = albumName[i];
                String itemAlbumArtist = albumArtist[i];
                String itemAlbumGenre = albumGenre[i];
                String itemAlbumIcon = albumImage1[i];
                String itemAlbumPrice = albumPrice[i];
                Items item = new Items("Vinyl", itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon,
                                                                                                        itemAlbumPrice);
                itemsList.add(item);
            }
        }
        return itemsList;
    }

}
