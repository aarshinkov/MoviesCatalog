package com.aarshinkov.moviescatalog;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMovieTitle = findViewById(R.id.tvMovieTitle);
        tvMovieTitle.setText("Avatar: The last airbender (2021)");

        TextView tvMovieInfo = findViewById(R.id.tvMovieInfo);
        tvMovieInfo.setText("Comedy | 120 min");

        ImageView movieHeader = findViewById(R.id.ivMovieHeader);
        final String movieHeaderImageUrl = "https://wallpaperaccess.com/full/2071603.jpg";
        loadImage(movieHeaderImageUrl, movieHeader);

        ImageView moviePoster = findViewById(R.id.ivMoviePoster);
        final String moviePosterImageUrl = "https://images-na.ssl-images-amazon.com/images/I/91FKuRPgwCL._AC_SL1500_.jpg";
        loadImage(moviePosterImageUrl, moviePoster);
    }

    private void loadImage(String imgUrl, ImageView imageView) {
        Picasso.get().load(imgUrl).into(imageView);
    }
}