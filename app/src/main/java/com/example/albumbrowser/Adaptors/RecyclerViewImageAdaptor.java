package com.example.albumbrowser.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albumbrowser.Models.RecyclerViewItem;
import com.example.albumbrowser.R;

import java.util.List;

public class RecyclerViewImageAdaptor extends RecyclerView.Adapter<RecyclerViewImageAdaptor.ViewHolder> {
    List<String> recyclerViewImages;
    Context context;

    public void RecyclerViewImageAdapter(Context context, List<String> recyclerViewImages) {
        this.recyclerViewImages = recyclerViewImages;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;

        public ViewHolder(View currentView) {
            super(currentView);
            recyclerView = currentView.findViewById(R.id.recyclerview_details);
        }
    }
    

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        RecyclerViewAdapter.ViewHolder viewHolder = new RecyclerViewAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    
    
    
}
