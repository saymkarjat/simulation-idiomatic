package com.saymk.roadmap.model.world

import com.saymk.roadmap.model.entity.Creature
import com.saymk.roadmap.model.entity.Entity

class WorldMap(
    val height: Int,
    val width: Int
) {
    val map: MutableMap<Coordinates, Entity> = mutableMapOf()

    fun addEntity(coordinates: Coordinates, entity: Entity) {
        map[coordinates] = entity
    }

    fun getEntity(coordinates: Coordinates): Entity? {
        return map[coordinates]
    }

    fun getReadOnlyWorldMap(): Map<Coordinates, Entity> {
        return map
    }

    fun replaceEntity(entity: Entity, target: Coordinates) {
        if(!isInside(target)) {
            throw IllegalArgumentException("Перемещение невозможно, " +
                    "координата находится за пределами карты")
        }
        val currentCoordinates = entity.coordinates
        map.remove(currentCoordinates)
        entity.coordinates = target
        addEntity(target, entity)
    }

    fun removeDeadAnimals() {
        map.entries.removeIf { (_, value) ->
            value is Creature && value.isDead
        }
    }
}

private fun WorldMap.isInside(coordinates: Coordinates): Boolean {
    val h = this.height
    val w = this.width

    val x = coordinates.x
    val y = coordinates.y

    return x in 0 until w && y in 0 until h
}