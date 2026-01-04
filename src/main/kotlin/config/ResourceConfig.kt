package com.saymk.roadmap.config

object ResourceConfig {
    private val configs = mapOf(
        Resources.GRASS to ResourceSettings(
            maxAmount = 20.0,
            initialAmount = 10.0,
            regenerationPerTick = 2.0
        )
    )

    fun getConfig(resource: Resources): ResourceSettings {
        return configs.getOrElse(resource) {
            throw IllegalArgumentException("Конфиг не найден.")
        }
    }

}

data class ResourceSettings(
    val maxAmount: Double,
    val initialAmount: Double,
    val regenerationPerTick: Double

)

enum class Resources {
    GRASS
}
