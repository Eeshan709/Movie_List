package com.example.movie_list1

import com.example.movie_list1.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=463fcb950f720a0217e3653dc503a1d1")
    fun getMovieList(): Call<MovieResponse>
}