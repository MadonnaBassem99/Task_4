package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import com.example.myapplication.network.modules.MovieResponse
import com.example.myapplication.repositry.MovieRepositry
import com.example.myapplication.repositry.MovieRepositry.requestMovies

class MainActivity : AppCompatActivity(), MovieRepositry.MovieCallBack {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        requestMovies(this)
            //code for loading image from url
        /* val image_url = ""
        Picasso.get().load(image_url).into(image_view)
         */
    }


    override fun onMoviesAvailble(movies: MovieResponse) {
        TODO("Not yet implemented")
        //resID.LayoutManager
        //reID.adapter
    }

    override fun onMoviesUnavailble(msg: String) {
        Toast.makeText(this@MainActivity ,msg,Toast.LENGTH_SHORT).show()
    }
}