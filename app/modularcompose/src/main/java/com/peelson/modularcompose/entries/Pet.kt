package com.peelson.modularcompose.entries

/**
 * 宠物
 *
 *  @author peelson
 *  @date 2021/11/18
 */
class Pet(
    val name: String,
    val species: String,
    val age: Int,
    val speech: String? = null
) {
    companion object {
        const val SPECIES_CAT = "🐈"
        const val SPECIES_TORTOISE = "🐢"

        val co = Pet("Nico", SPECIES_CAT, 2, "mewo")
        val xiu = Pet("咻咻", SPECIES_CAT, 3, "wang")
        val hu = Pet("呼呼", SPECIES_CAT, 1, "aaaaaaaa")
        val nemo = Pet("Nemo", SPECIES_TORTOISE, 1)
        val sandy = Pet("Sandy", SPECIES_TORTOISE, 1)
    }

}