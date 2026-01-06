package com.saymk.roadmap.model.entity

import com.saymk.roadmap.config.CreatureConfig
import com.saymk.roadmap.config.CreatureSettings
import com.saymk.roadmap.config.Species
import com.saymk.roadmap.model.world.Coordinates


class Wolf(
    override var coordinates: Coordinates
) : Creature() {
    override val sprite: String = "🐺"
    override val config: CreatureSettings =
        CreatureConfig.getConfig(Species.WOLF)
    override var isDead: Boolean = false
    override var hp: Double = config.maxHealth

    override fun toString(): String {
        return sprite
    }
}