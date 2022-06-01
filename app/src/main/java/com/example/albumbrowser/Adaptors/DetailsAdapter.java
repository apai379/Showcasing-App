package com.example.albumbrowser.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albumbrowser.DetailsActivity;
import com.example.albumbrowser.Models.Details;
import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.R;

import java.util.List;

public class DetailsAdapter extends ArrayAdapter<Details>{
    int mLayout;
    Context mContext;
    List<Details> mDetails;

    class ViewHolder {
        TextView albumTypeTextView, albumNameTextView, albumArtistTextView, albumGenreTextView, albumPriceTextView;
        TextView albumRatingView, albumReleaseYearView;

        public ViewHolder(View currentView) {
            albumTypeTextView = currentView.findViewById(R.id.details_type);
            albumNameTextView = currentView.findViewById(R.id.details_name);
            albumArtistTextView = currentView.findViewById(R.id.details_artist);
            albumGenreTextView = currentView.findViewById(R.id.details_genre);
            albumPriceTextView = currentView.findViewById(R.id.details_price);
            albumRatingView = currentView.findViewById(R.id.details_rating);
            albumReleaseYearView = currentView.findViewById(R.id.details_year);
        }
    }

    public DetailsAdapter(@NonNull Context context, int resource, @NonNull List<Details> objects) {
        super(context, resource, objects);
        mContext = context;
        mLayout = resource;
        mDetails = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListViewItem = convertView;

        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayout, parent, false);
        }

        ViewHolder vh = new ViewHolder(currentListViewItem);

        Details currentNumber = mDetails.get(position);

        vh.albumTypeTextView.setText(currentNumber.getAlbumType());
        vh.albumNameTextView.setText(currentNumber.getAlbumName());
        vh.albumArtistTextView.setText(currentNumber.getAlbumArtist());
        vh.albumGenreTextView.setText(currentNumber.getAlbumGenre());
        vh.albumPriceTextView.setText(currentNumber.getAlbumPrice());
        vh.albumRatingView.setText(currentNumber.getAlbumRating());
        vh.albumRatingView.setText(currentNumber.getAlbumReleaseYear());

        return currentListViewItem;
    }
}
