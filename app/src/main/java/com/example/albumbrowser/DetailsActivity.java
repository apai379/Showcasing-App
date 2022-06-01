package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.albumbrowser.Adaptors.RecyclerViewAdapter;
import com.example.albumbrowser.Adaptors.RecyclerViewImageAdaptor;
import com.example.albumbrowser.Models.RecyclerViewImage;

import java.util.LinkedList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    RecyclerViewImageAdaptor recyclerViewImageAdapter;
    List<RecyclerViewImage> testimages;
    RecyclerViewImage t1, t2, t3;

    class ViewHolder {
        RecyclerView recyclerView;

        public ViewHolder(){
            recyclerView = findViewById(R.id.recyclerview_details);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        vh = new ViewHolder();

        t1 = new RecyclerViewImage("afterhours_vinyl1");
        t2 = new RecyclerViewImage("afterhours_vinyl2");
        t3 = new RecyclerViewImage("afterhours_vinyl3");

        testimages = new LinkedList<RecyclerViewImage>();
        testimages.add(t1);
        testimages.add(t2);
        testimages.add(t3);

        recyclerViewImageAdapter = new RecyclerViewImageAdaptor(this, testimages);

        vh.recyclerView = findViewById(R.id.recyclerview_details);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        vh.recyclerView.setLayoutManager(linearLayoutManager);
        vh.recyclerView.setAdapter(recyclerViewImageAdapter);
    }
}