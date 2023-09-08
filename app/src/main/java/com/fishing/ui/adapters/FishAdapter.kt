package com.fishing.ui.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fishing.R
import com.fishing.data.models.FishModel
import com.fishing.databinding.FishItemLayoutBinding

class FishAdapter : ListAdapter<FishModel, FishAdapter.FishViewHolder>(FishCallBack()) {


    class FishViewHolder(private val binding: FishItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FishModel) {
            with(binding) {
                name.text = item.name
                length.text = "${item.weight} lb / ${item.length} inch"
                date.text = item.date
                if (item.imageUri != null) {
                    Glide.with(image)
                        .load(Uri.parse(item.imageUri))
                        .into(image)
                } else image.setImageResource(R.drawable.fish_item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishViewHolder {
        val binding =
            FishItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FishViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FishViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}