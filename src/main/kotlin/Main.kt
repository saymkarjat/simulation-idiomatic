package com.saymk.roadmap

import com.saymk.roadmap.model.entity.Obstacle
import com.saymk.roadmap.model.entity.Resource
import com.saymk.roadmap.model.entity.Wolf
import com.saymk.roadmap.model.world.Coordinates

fun main() {
    println(Wolf(Coordinates(1, 9)))
    println(Obstacle.Rock(Coordinates(1, 9)))
    println(Obstacle.Tree(Coordinates(1, 9)))
    println(Resource.Grass(Coordinates(1, 9)))
}