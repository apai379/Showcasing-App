package com.example.albumbrowser;

import com.example.albumbrowser.Models.Details;
import com.example.albumbrowser.Models.DetailsImages;
import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.Models.RecyclerViewImage;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DataProvider {

    private static String[] afterhoursvinyl = {"Vinyl", "After Hours", "The Weeknd", "R&B, Synthwave, Pop"
            , "45", "80", "2020", "afterhours_vinyl1", "afterhours_vinyl2", "afterhours_vinyl3"};

    private static String[] afterhourscd = {"CD", "After Hours", "The Weeknd", "R&B, Synthwave, Pop"
            , "45", "80", "2020", "afterhours_cd1", "afterhours_cd2", "afterhours_cd3"};

    private static String[] afterhourscassette = {"Cassette", "After Hours", "The Weeknd", "R&B, Synthwave, Pop"
            , "45", "80", "2020", "afterhours_cassette1", "afterhours_cassette2", "afterhours_cassette3"};

    private static String[] tdsotmvinyl = {"Vinyl", "The Dark Side Of The Moon", "Pink Floyd",
            "Rock, Psychedelic", "65", "91", "1973", "tdsotm_vinyl1", "tdsotm_vinyl2", "tdsotm_vinyl3"};

    private static String[] tdsotmcd = {"CD", "The Dark Side Of The Moon", "Pink Floyd",
            "Rock, Psychedelic", "65", "91", "1973", "tdsotm_cd1", "tdsotm_cd2", "tdsotm_cd3"};

    private static String[] tdsotmcassette = {"Cassette", "The Dark Side Of The Moon", "Pink Floyd",
            "Rock, Psychedelic", "65", "91", "1973", "tdsotm_cassette1", "tdsotm_cassette2", "tdsotm_cassette3"};

    private static String[] abbeyroadvinyl = {"Vinyl", "Abbey Road", "The Beatles",
            "Rock", "70", "100", "1969", "abbeyroad_vinyl1", "abbeyroad_vinyl2", "abbeyroad_vinyl3"};


    public static Map<Integer, String[]> generateData() {
        Map<Integer, String[]> albums = new LinkedHashMap<Integer, String[]>();
        albums.put(1, afterhoursvinyl);
        albums.put(2, tdsotmvinyl);
        albums.put(3, abbeyroadvinyl);
        albums.put(4, afterhourscd);
        albums.put(5, tdsotmcd);
        albums.put(6, afterhourscassette);
        albums.put(7, tdsotmcassette);
        return albums;
    }

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
        Map<Integer, String[]> albums = generateData();
        int start = 0;
        int end = 0;
        if (type.equals("Vinyl")) {
            start = 1;
            end = 3;
        } else if (type.equals("CD")) {
            start = 4;
            end = 5;
        } else if (type.equals("Cassette")) {
            start = 6;
            end = 7;
        }
        for (int i = start; i <= end; i++) {
            String[] data = albums.get(i);
            String itemAlbumType = data[0];
            String itemAlbumName = data[1];
            String itemAlbumArtist = data[2];
            String itemAlbumGenre = data[3];
            String itemAlbumPrice = data[4];
            String itemAlbumIcon = data[7];
            Items item = new Items(itemAlbumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon, itemAlbumPrice);
            itemsList.add(item);
        }
        return itemsList;
    }

    public static List<Items> getSearchedItems(String search) {
        List<Items> itemsList = new LinkedList<Items>();
        Map<Integer, String[]> albums = generateData();
        for (String[] data : albums.values()) {
            if (data[1].equals(search) || data[2].equals(search) || data[3].contains(search)) {
                String itemAlbumType = data[0];
                String itemAlbumName = data[1];
                String itemAlbumArtist = data[2];
                String itemAlbumGenre = data[3];
                String itemAlbumPrice = data[4];
                String itemAlbumIcon = data[7];
                Items item = new Items(itemAlbumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon, itemAlbumPrice);
                if (!itemsList.contains(item)) {
                    itemsList.add(item);
                }
            }
        }
        return itemsList;
    }


    public static Details getDetails(String type, String name) {
        Map<Integer, String[]> albums = generateData();

        for (String[] data : albums.values()) {
            if (data[0].equals(type) && data[1].equals(name)) {
                String detailsAlbumType = data[0];
                String detailsAlbumName = data[1];
                String detailsAlbumArtist = data[2];
                String detailsAlbumGenre = data[3];
                String detailsAlbumPrice = data[4];
                String detailsAlbumRating = data[5];
                String detailsAlbumReleaseYear = data[6];
                Details details = new Details(detailsAlbumType, detailsAlbumName, detailsAlbumArtist, detailsAlbumGenre,
                        detailsAlbumPrice, detailsAlbumRating, detailsAlbumReleaseYear);
                return details;
            }
        }
        return null;
    }

    public static List<RecyclerViewImage> getRecyclerViewImages(String type, String name) {
        List<RecyclerViewImage> imagesList = new LinkedList<RecyclerViewImage>();
        Map<Integer, String[]> albums = generateData();

        for (String[] data : albums.values()) {
            if (data[0].equals(type) && data[1].equals(name)) {
                String rvAlbumImage1 = data[7];
                String rvAlbumImage2 = data[8];
                String rvAlbumImage3 = data[9];
                RecyclerViewImage recyclerViewImage1 = new RecyclerViewImage(rvAlbumImage1);
                RecyclerViewImage recyclerViewImage2 = new RecyclerViewImage(rvAlbumImage2);
                RecyclerViewImage recyclerViewImage3 = new RecyclerViewImage(rvAlbumImage3);
                imagesList.add(recyclerViewImage1);
                imagesList.add(recyclerViewImage2);
                imagesList.add(recyclerViewImage3);
                return imagesList;
            }
        }
        return null;
    }

    public static RecyclerViewItem getRecyclerViewItem(String type, String name) {
        Map<Integer, String[]> albums = generateData();

        for (String[] data : albums.values()) {
            if (data[0].equals(type) && data[1].equals(name)) {
                String itemAlbumType = data[0];
                String itemAlbumName = data[1];
                String itemAlbumPrice = data[4];
                String itemAlbumIcon = data[7];
                RecyclerViewItem recyclerViewItem = new RecyclerViewItem(itemAlbumType, itemAlbumName, itemAlbumPrice, itemAlbumIcon);
                return recyclerViewItem;
            }
        }
        return null;

    }

}
