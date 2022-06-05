package com.example.albumbrowser;

import com.example.albumbrowser.Models.Details;
import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.Models.RecyclerViewItem;

import java.util.Arrays;
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

    private static String[] abbeyroadcd = {"CD", "Abbey Road", "The Beatles",
            "Rock", "70", "100", "1969", "abbeyroad_cd1", "abbeyroad_cd2", "abbeyroad_cd3"};

    private static String[] thrillervinyl = {"Vinyl", "Thriller", "Michael Jackson",
            "Pop, Disco, R&B, Funk", "9", "100", "1982", "thriller_vinyl1", "thriller_vinyl2", "thriller_vinyl3"};

    private static String[] thrillercd = {"CD", "Thriller", "Michael Jackson",
            "Pop, Disco, R&B, Funk", "9", "100", "1982", "thriller_cd1", "thriller_cd2", "thriller_cd3"};

    private static String[] thrillercassette = {"Cassette", "Thriller", "Michael Jackson",
            "Pop, Disco, R&B, Funk", "9", "100", "1982", "thriller_cassette1", "thriller_cassette2", "thriller_cassette3"};

    private static String[] nevermindcassette = {"Cassette", "Nevermind", "Nirvana", "Grunge, Rock", "74", "85", "1991",
            "nevermind_cassette1", "nevermind_cassette2", "nevermind_cassette3"};

    private static String[] aftpcd = {"CD", "Automatic for the People", "R.E.M.", "Rock", "10", "96", "1992",
            "aftp_cd1", "aftp_cd2", "aftp_cd3"};

    private static String[] isthisitvinyl = {"Vinyl", "Is This It", "The Strokes",
            "Rock, Punk", "9", "91", "2001", "isthisit_vinyl1", "isthisit_vinyl2", "isthisit_vinyl3"};

    private static String[] illmaticcassette = {"Cassette", "Illmatic", "Nas",
            "Hip Hop", "250", "100", "1994", "illmatic_cassette1", "illmatic_cassette2", "illmatic_cassette3"};

    private static String[] gkmccd = {"CD", "Good Kid, M.A.A.D City", "Kendrick Lamar",
            "Hip Hop", "72", "95", "1976", "gkmc_cd1", "gkmc_cd2", "gkmc_cd3"};

    private static String[] hotelcaliforniavinyl = {"Vinyl", "Hotel California", "The Eagles",
            "Rock", "30", "82", "1976", "hotelcalifornia_vinyl1", "hotelcalifornia_vinyl2", "hotelcalifornia_vinyl3"};

    private static String[] thestrangercassette = {"Cassette", "The Stranger", "Billy Joel",
            "Pop, Rock", "40", "85", "1977", "thestranger_cassette1", "thestranger_cassette2", "thestranger_cassette3"};

    private static String[] toxicitycd = {"CD", "Toxicity", "System of a Down",
            "Metal", "7", "83", "2001", "toxicity_cd1", "toxicity_cd2", "toxicity_cd3"};

    private static String[] ridethelightningvinyl = {"Vinyl", "Ride the Lightning", "Metallica",
            "Metal", "57", "78", "1984", "ridethelightning_vinyl1", "ridethelightning_vinyl2", "ridethelightning_vinyl3"};

    private static String[] discoverycassette = {"Cassette", "Discovery", "Daft Punk",
            "Disco", "89", "78", "2001", "discovery_cassette1", "discovery_cassette2", "discovery_cassette3"};

    private static String[] isthisitcd = {"CD", "Is This It", "The Strokes",
            "Rock, Punk", "9", "91", "2001", "isthisit_cd1", "isthisit_cd2", "isthisit_cd3"};

    private static String[] americanidiotcd = {"CD", "American Idiot", "Green Day",
            "Rock, Punk", "9", "79", "2004", "americanidiot_cd1", "americanidiot_cd2", "americanidiot_cd3"};

    private static String[] lemonadevinyl = {"Vinyl", "Lemonade", "Beyonce",
            "R&B, Pop", "80", "92", "2016", "lemonade_vinyl1", "lemonade_vinyl2", "lemonade_vinyl3"};

    private static String[] evermorecassette = {"Cassette", "Evermore", "Taylor Swift",
            "Rock, Pop, Folk", "18", "81", "2020", "evermore_cassette1", "evermore_cassette2", "evermore_cassette3"};

    private static String[] melodramacd = {"CD", "Melodrama", "Lorde",
            "Pop, Electronic", "22", "93", "2017", "melodrama_cd1", "melodrama_cd2", "melodrama_cd3"};

    private static String[] tidalcassette = {"Cassette", "Tidal", "Fiona Apple",
            "Pop, Experimental", "17", "90", "1996", "tidal_cassette1", "tidal_cassette2", "tidal_cassette3"};

    private static String[] iwalkthelinevinyl = {"Vinyl", "I Walk The Line", "Johnny Cash",
            "Country", "13", "95", "1964", "iwalktheline_vinyl1", "iwalktheline_vinyl2", "iwalktheline_vinyl3"};

    private static String[] igorcassette = {"Cassette", "Igor", "Tyler, The Creator",
            "Hip Hop, R&B, Funk", "18", "94", "2019", "igor_cassette1", "igor_cassette2", "igor_cassette3"};

    private static String[] blackstarvinyl = {"Vinyl", "Blackstar", "David Bowie",
            "Rock, Jazz, Experimental", "63", "88", "2016", "blackstar_vinyl1", "blackstar_vinyl2", "blackstar_vinyl3"};

    public static Map<Integer, String[]> generateData() {
        Map<Integer, String[]> albums = new LinkedHashMap<Integer, String[]>();
        albums.put(1, afterhoursvinyl);
        albums.put(2, tdsotmvinyl);
        albums.put(3, abbeyroadvinyl);
        albums.put(4, afterhourscd);
        albums.put(5, tdsotmcd);
        albums.put(6, afterhourscassette);
        albums.put(7, tdsotmcassette);
        albums.put(8, thrillercassette);
        albums.put(9, thrillervinyl);
        albums.put(10, thrillercd);
        albums.put(11, abbeyroadcd);
        albums.put(12, nevermindcassette);
        albums.put(13, aftpcd);
        albums.put(14, isthisitvinyl);
        albums.put(15, illmaticcassette);
        albums.put(16, gkmccd);
        albums.put(17, hotelcaliforniavinyl);
        albums.put(18, thestrangercassette);
        albums.put(19, toxicitycd);
        albums.put(20, ridethelightningvinyl);
        albums.put(21, discoverycassette);
        albums.put(22, isthisitcd);
        albums.put(23, americanidiotcd);
        albums.put(24, lemonadevinyl);
        albums.put(25, evermorecassette);
        albums.put(26, melodramacd);
        albums.put(27, tidalcassette);
        albums.put(28, iwalkthelinevinyl);
        albums.put(29, igorcassette);
        albums.put(30, blackstarvinyl);
        return albums;
    }

    public static List<Items> getItems(String type) {
        List<Items> itemsList = new LinkedList<Items>();
        Map<Integer, String[]> albums = generateData();
        for (String[] data : albums.values()) {
            if (data[0].equals(type)) {
                String itemAlbumType = data[0];
                String itemAlbumName = data[1];
                String itemAlbumArtist = data[2];
                String itemAlbumGenre = data[3];
                String itemAlbumPrice = data[4];
                String itemAlbumIcon = data[7];
                Items item = new Items(itemAlbumType, itemAlbumName, itemAlbumArtist, itemAlbumGenre, itemAlbumIcon, itemAlbumPrice);
                itemsList.add(item);
            }
        }
        return itemsList;
    }

    public static List<Items> getSearchedItems(String search) {
        List<Items> itemsList = new LinkedList<Items>();
        Map<Integer, String[]> albums = generateData();
        for (String[] data : albums.values()) {
            String[] genres = data[3].split(", ");
            if (data[1].equals(search) || data[2].equals(search) || Arrays.stream(genres).anyMatch(search::equals)) {
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

    public static String[] getImages(String type, String name) {
        Map<Integer, String[]> albums = generateData();

        for (String[] data : albums.values()) {
            if (data[0].equals(type) && data[1].equals(name)) {
                String[] imagesList = {data[7], data[8], data[9]};
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
