package com.example.albumbrowser;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
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

=======

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

>>>>>>> 969337f3bb9a8af56b7816d69824245692fae437
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        vh = new ViewHolder();

        vh.cardviewVinyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersActivity = new Intent (getBaseContext(), ListActivity.class);
                startActivity (numbersActivity);
            }
        });
=======
>>>>>>> 969337f3bb9a8af56b7816d69824245692fae437
    }
}