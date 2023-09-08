package com.fishing.data.dataBase.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fishing.data.dataBase.dao.FishDao
import com.fishing.data.dataBase.entities.FishEntity

@Database(entities = [FishEntity::class], version = 1)
abstract class FishDataBase:RoomDatabase() {
    abstract fun fishDao(): FishDao
}