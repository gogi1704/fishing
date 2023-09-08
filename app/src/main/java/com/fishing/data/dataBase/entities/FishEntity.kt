package com.fishing.data.dataBase.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fishing.data.models.FishModel

@Entity
data class FishEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int ,
    val name: String,
    val weight: String,
    val length: String,
    val lureType: String,
    val lureBrand: String,
    val lureColor: String,
    val info:String,
    val date:String,
    val imageUri:String
)

fun FishEntity.toModel() = FishModel(
    this.id ,
    this.name,
    this.weight,
    this.length,
    this.lureType,
    this.lureBrand,
    this.lureColor,
    this.info,
    this.date,
    this.imageUri,
)
