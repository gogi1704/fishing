package com.fishing.ui.adapters

import androidx.recyclerview.widget.DiffUtil
import com.fishing.data.models.FishModel

class FishCallBack : DiffUtil.ItemCallback<FishModel>() {
    override fun areItemsTheSame(oldItem: FishModel, newItem: FishModel): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: FishModel, newItem: FishModel): Boolean =
        oldItem == newItem
}