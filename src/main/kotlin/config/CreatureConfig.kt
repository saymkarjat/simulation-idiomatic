package com.saymk.roadmap.config

object CreatureConfig {
    private val configs = mapOf(
        Species.WOLF to CreatureSettings(
            name = "Wolf",
            maxHealth = 100.0,
            speed = 3,
            maxFoodDetectionDistance = 15,
            maxMovesWithoutFood = 5,
            weight = 60.0,
            preys = setOf(Species.SHEEP, Species.RABBIT),
            diet = CreatureDiet.CARNIVORE
        ),
        Species.FOX to CreatureSettings(
            name = "Fox",
            maxHealth = 100.0,
            speed = 2,
            maxFoodDetectionDistance = 10,
            maxMovesWithoutFood = 8,
            weight = 20.0,
            preys = setOf(Species.RABBIT),
            diet = CreatureDiet.CARNIVORE
        ),
        Species.SHEEP to CreatureSettings(
            name = "Sheep",
            maxHealth = 100.0,
            speed = 1,
            maxFoodDetectionDistance = 5,
            maxMovesWithoutFood = 4,
            weight = 40.0,
            diet = CreatureDiet.HERBIVORE
        ),
        Species.RABBIT to CreatureSettings(
            name = "Rabbit",
            maxHealth = 100.0,
            speed = 4,
            maxFoodDetectionDistance = 3,
            maxMovesWithoutFood = 7,
            weight = 10.0,
            diet = CreatureDiet.HERBIVORE
        )
    )

    fun getConfig(creature: Species): CreatureSettings {
        return configs.getOrElse(creature) {
            throw IllegalArgumentException("Конфиг не найден.")
        }
    }

}

data class CreatureSettings(
    val name: String,
    val maxHealth: Double,
    val speed: Int,
    val maxFoodDetectionDistance: Int,
    val maxMovesWithoutFood: Int,
    val weight: Double,
    val preys: Set<Species> = emptySet(),
    val diet: CreatureDiet
)

enum class Species {
    WOLF,
    FOX,
    SHEEP,
    RABBIT
}

enum class CreatureDiet {
    HERBIVORE,
    CARNIVORE,
    OMNIVORE
}