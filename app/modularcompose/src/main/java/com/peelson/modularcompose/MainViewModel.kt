package com.peelson.modularcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.peelson.modularcompose.entries.Pet

/**
 *
 *  @author peelson
 *  @date 2021/11/18
 */
class MainViewModel : ViewModel() {

    var myPets by mutableStateOf(
        listOf(
            Pet.co,
            Pet.xiu,
            Pet.hu,
            Pet.nemo,
            Pet.sandy,
            Pet.co,
            Pet.xiu,
            Pet.hu,
            Pet.nemo,
            Pet.sandy,
            Pet.co,
            Pet.xiu,
            Pet.hu,
            Pet.nemo,
            Pet.sandy,
            Pet.co,
            Pet.xiu,
            Pet.hu,
            Pet.nemo,
            Pet.sandy
        )
    )

    fun noun(pet: Pet): String =
        if (pet.speech.isNullOrEmpty()) {
            "${pet.name} 可不会叫"
        } else {
            "${pet.speech} ~"
        }
}