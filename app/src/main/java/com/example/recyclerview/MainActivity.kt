package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var superHeroFirst = listOf<SuperHero>(
        SuperHero(
            "Batman",
            "DC",
            "Bruno Díaz",
            "https://images.hdqwalls.com/wallpapers/the-batman-robert-2021-bl.jpg"
        ),
        SuperHero(
            "https://www.wallpaperup.com/uploads/wallpapers/2013/06/14/102891/0fb6df085d56d99fec30784ea5f4772a.jpg",
            "Marvel",
            "Bruce Banner",
            "insertefotoaqui"
        ),
        SuperHero(
            "Ironman",
            "Marvel",
            "Tony Stark",
            "https://www.cinemascomics.com/wp-content/uploads/2020/04/iron-man-primera-pelicula-de-marvel.jpg"
        ),
        SuperHero(
            "Wolverine",
            "Marvel",
            "Logan",
            "https://www.sideshow.com/storage/product-images/500555U/wolverine_marvel_feature.jpg"
        ),
        SuperHero(
            "Cyclops",
            "Marvel",
            "Scot Summers",
            "https://i.pinimg.com/originals/a4/4f/45/a44f45f683ac7e4706dc3c0b2867c1fd.jpg"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}