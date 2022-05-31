package com.example.albumbrowser.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albumbrowser.Models.Items;
import com.example.albumbrowser.Models.RecyclerViewItem;
import com.example.albumbrowser.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<RecyclerViewItem> recyclerViewItems;
    Context context;


    public RecyclerViewAdapter(Context context, List<RecyclerViewItem> recyclerViewItems) {
        this.recyclerViewItems = recyclerViewItems;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView albumTypeTextView, albumNameTextView, albumPriceTextView;
        ImageView albumIconImageView;

        public ViewHolder(View currentView) {
            super(currentView);
            albumTypeTextView = currentView.findViewById(R.id.recyclerview_item_albumtype);
            albumNameTextView = currentView.findViewById(R.id.recyclerview_item_albumname);
            albumPriceTextView = currentView.findViewById(R.id.recyclerview_item_albumprice);
            albumIconImageView = currentView.findViewById(R.id.recyclerview_item_image);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        RecyclerViewItem currentItem = recyclerViewItems.get(position);

        //Set the attributed of list_view_number_item views
        int i = context.getResources().getIdentifier(
                currentItem.getAlbumIcon(), "drawable",
                context.getPackageName());
        viewholder.albumIconImageView.setImageResource(i);

        viewholder.albumTypeTextView.setText(currentItem.getAlbumType());
        viewholder.albumNameTextView.setText(currentItem.getAlbumName());
        viewholder.albumPriceTextView.setText(currentItem.getAlbumPrice());
    }

    @Override
    public int getItemCount() {
        return recyclerViewItems.size();
    }



}
