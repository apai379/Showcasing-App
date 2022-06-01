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

import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.R;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    int mLayout;
    Context mContext;
    List<Items> mItems;


    class ViewHolder {
        TextView albumTypeTextView, albumNameTextView, albumArtistTextView, albumGenreTextView, albumPriceTextView;
        ImageView albumIconView;

        public ViewHolder(View currentView) {
            albumTypeTextView = currentView.findViewById(R.id.items_listview_albumType);
            albumNameTextView = currentView.findViewById(R.id.items_listview_albumName);
            albumArtistTextView = currentView.findViewById(R.id.items_listview_albumArtist);
            albumGenreTextView = currentView.findViewById(R.id.items_listview_albumGenre);
            albumPriceTextView = currentView.findViewById(R.id.items_listview_albumPrice);
            albumIconView = currentView.findViewById(R.id.items_listview_albumIcon);
        }
    }

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        mContext = context;
        mLayout = resource;
        mItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayout, parent, false);
        }

        ViewHolder vh = new ViewHolder(currentListViewItem);

        //Get the Number object for the current position
        Items currentNumber = mItems.get(position);

        //Set the attributed of list_view_number_item views
        int i = mContext.getResources().getIdentifier(
                currentNumber.getAlbumIcon(), "drawable",
                mContext.getPackageName());

        //Setting the icon
        vh.albumIconView.setImageResource(i);

        vh.albumTypeTextView.setText(currentNumber.getAlbumType());
        vh.albumNameTextView.setText(currentNumber.getAlbumName());
        vh.albumArtistTextView.setText(currentNumber.getAlbumArtist());
        vh.albumGenreTextView.setText(currentNumber.getAlbumGenre());
        vh.albumPriceTextView.setText(currentNumber.getAlbumPrice());

        return currentListViewItem;

    }
}
