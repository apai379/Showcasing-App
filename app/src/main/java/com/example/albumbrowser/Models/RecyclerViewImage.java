package com.example.albumbrowser.Models;

public class RecyclerViewImage {
    public class RecyclerViewItem {
        String albumImage;

        public RecyclerViewItem(String albumImage) {
            this.albumImage = albumImage;
        }

        public String getAlbumImage() {
            return albumImage;
        }

    }
}
