package com.fishing.data.dataBase.di

import android.content.Context
import androidx.room.Room
import com.fishing.data.dataBase.dao.FishDao
import com.fishing.data.dataBase.db.FishDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 class DataBaseModule {

    companion object {
        private const val DATA_BASE_NAME = "FISH_DATA_BASE"
    }

    @Provides
    @Singleton
    fun provideDb(@ApplicationContext context: Context): FishDataBase =
        Room.databaseBuilder(context = context, FishDataBase::class.java, DATA_BASE_NAME).build()

    @Provides
    @Singleton
    fun provideFishDao(dataBase: FishDataBase): FishDao = dataBase.fishDao()

}