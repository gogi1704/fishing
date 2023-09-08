package com.fishing.ui.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.fishing.data.dataBase.entities.toModel
import com.fishing.data.models.FishModel
import com.fishing.data.repository.FishingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FishingViewModel @Inject constructor(
    application: Application,
    private val repository: FishingRepository
) :
    AndroidViewModel(application) {

//
//    val allFishLiveData = repository.getAll()
//        .flowOn(Dispatchers.Default)
//        .map { it.map { fish -> fish.toModel() } }
//        .asLiveData()
//
//
//    fun addFish(fishModel: FishModel) {
//        viewModelScope.launch {
//            repository.addFish(fishModel)
//        }
//    }

    private val fishEnemiesList = listOf(
        "anchovy",
        "barracuda",
        "bream",
        "burbot",
        "carp",
        "catfish",
        "cisco",
        "chum salmon",
        "cod",
        "crucian carp",
        "dorado",
        "eel",
        "flounder",
        "grayling",
        "grouper",
        "haddock",
        "hake",
        "halibut",
        "herring",
        "ide",
        "mackerel",
        "mullet",
        "roach",
        "ruffe",
        "perch",
        "pike",
        "pikeperch",
        "pink salmon",
        "piranha",
        "redeye",
        "sardine",
        "sea bass",
        "salmon",
        "saury",
        "shark",
        "smelt",
        "sprat",
        "sterlet",
        "sturgeon",
        "tilapia",
        "trout",
        "tuna",
        "vobla",
        "whitefish",
    )


}