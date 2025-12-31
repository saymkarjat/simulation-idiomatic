package com.saymk.roadmap.config

object CreatureConfig {

}

data class CreatureSettings(
    val name: String,
    val maxHealth: Int,
    val speed: Int,
    val maxFoodDetectionDistance: Int,
    val maxMovesWithoutFood: Int,
    val weight: Double,
    val preys: Set<Species> = emptySet()
)

enum class Species {
    WOLF,
    FOX,
    SHEEP,
    RABBIT
}
