package com.example.albumbrowser;

import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.LinkedList;
import java.util.List;

public class DataProvider {
    private static String[] albumName = {"After Hours", "The Dark Side Of The Moon", "After Hours", "The Dark Side Of The Moon",
    "After Hours", "The Dark Side Of The Moon"};

    private static String[] albumType = {"Vinyl", "Vinyl", "CD", "CD", "Cassette", "Cassette"};

    private static String[] albumArtist = {"The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd", "The Weeknd", "Pink Floyd"};

    private static String[] albumGenre = {"R&B, Synthwave, Pop", "Rock, Psychedelic", "R&B, Synthwave, Pop",
    "Rock, Psychedelic", "R&B, Synthwave, Pop", "Rock, Psychedelic"};

    private static String[] albumRating = {"80", "91", "80", "91", "80", "91"};

    private static String[] albumPrice = {"45", "65", "45", "65", "45", "65"};

    private static String[] albumReleaseYear = {"2020", "1973", "2020", "1973", "2020", "1973"};

    private static String[] albumImage1 = {"afterhours_vinyl1", "tdsotm_vinyl1", "afterhours_cd1", "tdsotm_cd1",
    "afterhours_cassette1", "tdsotm_cassette1"};

    private static String[] albumImage2 = {"afterhours_vinyl2", "tdsotm_vinyl2", "afterhours_cd2", "tdsotm_cd2",
            "afterhours_cassette2", "tdsotm_cassette2"};

    private static String[] albumImage3 = {"afterhours_vinyl3", "tdsotm_vinyl3", "afterhours_cd3", "tdsotm_cd3",
            "afterhours_cassette3", "tdsotm_cassette3"};


    public static List<Items> getItems(String type) {
        List<Items> itemsList = new LinkedList<Items>();
        for (int i = 0; i < albumType.length; i++) {
            if (albumType[i] == type) {
                String itemAlbumType = albumType[i];
                String itemAlbumName = albumName[i];
                String itemAlbumArtist = albumArtist[i];
                String itemAlbumGenre = albumGenre[i];
                String itemAlbumIcon = albumImage1[i];
                String itemAlbumPrice = albumPrice[i];
                Items item = new Items(itemAlbumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon, itemAlbumPrice);
                itemsList.add(item);
            }
        }
        return itemsList;
    }

    public static List<Items> getDetails() {
        List<Items> itemsList = new LinkedList<Items>();
        for (int i = 0; i < albumType.length; i++) {
                String itemAlbumType = albumType[i];
                String itemAlbumName = albumName[i];
                String itemAlbumArtist = albumArtist[i];
                String itemAlbumGenre = albumGenre[i];
                String itemAlbumIcon = albumImage1[i];
                String itemAlbumPrice = albumPrice[i];
                Items item = new Items(itemAlbumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon, itemAlbumPrice);
                itemsList.add(item);
            }
        return itemsList;
    }

    public static List<RecyclerViewItem> getRecyclerViewItems(String type) {
        List<RecyclerViewItem> itemsList = new LinkedList<RecyclerViewItem>();
        for (int i = 0; i < albumType.length; i++) {
            if (albumType[i] == type) {
                String itemAlbumType = albumType[i];
                String itemAlbumName = albumName[i];
                String itemAlbumPrice = albumPrice[i];
                String itemAlbumIcon = albumImage1[i];
                RecyclerViewItem recyclerViewItem = new RecyclerViewItem(itemAlbumType, itemAlbumName, itemAlbumPrice, itemAlbumIcon);
                itemsList.add(recyclerViewItem);
            }
        }
        return itemsList;
    }

    public static int length(){
        return albumType.length;
    }

}
