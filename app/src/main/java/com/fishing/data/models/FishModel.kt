package com.fishing.data.models

import com.fishing.data.dataBase.entities.FishEntity


data class FishModel(
    val id: Int = 0,
    val name: String,
    val weight: String,
    val length: String,
    val lureType: String,
    val lureBrand: String,
    val lureColor: String,
    val info: String,
    val date: String,
    val imageUri: String? = null
)

fun FishModel.toEntity() = FishEntity(
    this.id,
    this.name,
    this.weight,
    this.length,
    this.lureType,
    this.lureBrand,
    this.lureColor,
    this.info,
    this.date,
    this.imageUri ?: "null"
)