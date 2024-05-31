package com.garisas.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;
    private Button _btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = findViewById(R.id.imageView1);

        String imageUrl = "https://th.bing.com/th/id/OIG1.XhM51k9.FM16qwCYuLX7?w=1024&h=1024&rs=1&pid=ImgDetMain";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}