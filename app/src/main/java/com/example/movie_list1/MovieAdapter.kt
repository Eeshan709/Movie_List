package com.example.movie_list1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: List<MovieItem>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,
        parent,false)
        return MovieViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val currentItem = movieList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text1
    }

    override fun getItemCount() = movieList.size

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.movie_image)
        val textView: TextView= itemView.findViewById(R.id.movie_title)
    }


}