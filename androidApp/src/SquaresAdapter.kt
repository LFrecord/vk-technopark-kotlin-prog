package com.example.mefirsthomework

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SquaresAdapter(private var count: Int) : RecyclerView.Adapter<SquaresAdapter.ViewHolder>() {

    class ViewHolder(val square: TextView) : RecyclerView.ViewHolder(square)

    fun addItem() {
        count++
        notifyItemInserted(count - 1)
    }

    override fun getItemCount() = count

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_square, parent, false)
        return ViewHolder(view as TextView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.square.text = position.toString()
        holder.square.setBackgroundResource(
            if (position % 2 == 0) R.color.even_square else R.color.odd_square
        )
    }
}
