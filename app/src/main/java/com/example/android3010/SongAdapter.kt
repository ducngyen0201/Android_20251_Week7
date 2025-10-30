package com.example.android3010

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val songList: List<SongItem>) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {
    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.textView)
        val artist = itemView.findViewById<TextView>(R.id.textView2)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songList[position]
        holder.name.text = song.songName
        holder.artist.text = song.songArtist
        holder.img.setImageResource(R.drawable.img)
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return SongViewHolder(itemView)

    }
}