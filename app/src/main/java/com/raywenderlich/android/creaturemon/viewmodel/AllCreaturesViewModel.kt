package com.raywenderlich.android.creaturemon.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.raywenderlich.android.creaturemon.model.Creature
import com.raywenderlich.android.creaturemon.model.CreatureRepository
import com.raywenderlich.android.creaturemon.model.room.RoomRepository

class AllCreaturesViewModel(
        private val repository: CreatureRepository = RoomRepository()
) : ViewModel() {
    private val allCreaturesLiveData = repository.getAllCreatures()

    fun getAllCreaturesLiveData() = allCreaturesLiveData

    fun clearAllCreatures() = repository.clearAllCreatures()
}
