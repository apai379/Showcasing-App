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

import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    ArrayAdapter<String> recyclerViewDetails;

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
    }
}