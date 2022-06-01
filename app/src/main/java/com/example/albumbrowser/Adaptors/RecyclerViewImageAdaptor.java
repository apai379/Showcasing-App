package com.example.albumbrowser.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albumbrowser.Models.RecyclerViewImage;
import com.example.albumbrowser.R;

import java.util.List;

public class RecyclerViewImageAdaptor extends RecyclerView.Adapter<RecyclerViewImageAdaptor.ViewHolder> {
    List<RecyclerViewImage> recyclerViewImages;
    Context context;

    public RecyclerViewImageAdaptor(Context context, List<RecyclerViewImage> recyclerViewImages) {
        this.recyclerViewImages = recyclerViewImages;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;

        public ViewHolder(View currentView) {
            super(currentView);
            image = currentView.findViewById(R.id.recyclerview_image);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_image, parent, false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        RecyclerViewImage currentImage = recyclerViewImages.get(position);

        //Set the attributed of list_view_number_item views
        int i = context.getResources().getIdentifier(
                currentImage.getAlbumImage(), "drawable",
                context.getPackageName());

        viewholder.image.setImageResource(i);
    }

    @Override
    public int getItemCount() {
        return recyclerViewImages.size();
    }




}
