package com.example.networktest.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googlebooks.databinding.ItemLayoutBinding
import com.example.googlebooks.model.presentation.VolumeItem
import com.example.googlebooks.view.BookViewHolder


class BookAdapter(private val dataSet: List<VolumeItem>,private val openDisplayFragment:(VolumeItem)->Unit )
    : RecyclerView.Adapter<BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BookViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.onBind(dataSet[position]){
            openDisplayFragment(it)
        }
    }

    override fun getItemCount(): Int  = dataSet.size

}