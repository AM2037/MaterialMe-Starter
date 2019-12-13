package com.ngamolsky.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.materialme.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize title and image from SportsAdapter.java view holder onClick
        TextView sportsTitle = (TextView) findViewById(R.id.titleDetail);
        ImageView sportsImage = (ImageView) findViewById(R.id.sportsImageDetail);

        // get title from incoming intent (from SportsAdapter.java) and set to TextView
        sportsTitle.setText(getIntent().getStringExtra("title"));

        // Use Glide to load image into ImageView
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);
    }
}
