package com.saymk.roadmap.model.entity

import com.saymk.roadmap.config.CreatureSettings
import com.saymk.roadmap.config.ResourceConfig
import com.saymk.roadmap.config.ResourceSettings
import com.saymk.roadmap.config.Resources
import com.saymk.roadmap.model.behaviour.Movable
import com.saymk.roadmap.model.world.Coordinates

sealed class Entity {
    abstract val sprite: String
    abstract var coordinates: Coordinates
}

sealed class Obstacle : Entity() {
    class Tree(
        override var coordinates: Coordinates
    ) : Obstacle() {
        override val sprite: String = "🌲"

        override fun toString(): String {
            return sprite
        }
    }

    class Rock(
        override var coordinates: Coordinates
    ) : Obstacle() {
        override val sprite: String = "🗿"

        override fun toString(): String {
            return sprite
        }
    }
}

sealed class Resource : Entity() {
    abstract val config: ResourceSettings
    abstract var remainder: Double

    class Grass(
        override var coordinates: Coordinates,
    ) : Resource() {
        override val sprite: String = "🌿"
        override val config: ResourceSettings =
            ResourceConfig.getConfig(Resources.GRASS)
        override var remainder: Double = config.initialAmount

        override fun toString(): String {
            return sprite
        }
    }
}

sealed class Creature : Entity(), Movable {
    abstract var hp: Double
    abstract val config: CreatureSettings
    abstract var isDead: Boolean

    override fun move() {

    }
}
