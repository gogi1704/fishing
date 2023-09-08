package com.fishing.data.repository

import com.fishing.data.dataBase.dao.FishDao
import com.fishing.data.dataBase.entities.FishEntity
import com.fishing.data.models.FishModel
import com.fishing.data.models.toEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FishingRepository @Inject constructor(private val dao: FishDao) {

//     fun getAll(): Flow<List<FishEntity>> = dao.getAll()
//
//    suspend fun addFish(fishModel: FishModel){
//        dao.addFish(fishModel.toEntity())
//    }

}