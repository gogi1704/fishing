package com.fishing.data.dataBase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fishing.data.dataBase.entities.FishEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FishDao {

    @Query("SELECT * FROM FishEntity")
    fun getAll(): Flow<List<FishEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFishItem(item:FishEntity)




}