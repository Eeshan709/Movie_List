package com.example.movie_list1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //private lateinit var linearLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = fillMovieList(500)
        recycler_view.adapter = MovieAdapter(movieList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }

    private fun fillMovieList(size: Int): List<MovieItem> {

        val list = ArrayList<MovieItem>()

        for (i in 0 until size){
           val drawable = R.drawable.the_dark_knight

            val item = MovieItem(drawable, "Movie $i")
            list += item
        }
        return list

    }

}