package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    class ViewHolder {
        CardView cardviewVinyl;
        public ViewHolder(){
            cardviewVinyl = findViewById(R.id.cardview_vinyl);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vh = new ViewHolder();

        vh.cardviewVinyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersActivity = new Intent (getBaseContext(), ListActivity.class);
                startActivity (numbersActivity);
            }
        });
    }
}