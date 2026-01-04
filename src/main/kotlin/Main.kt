package com.saymk.roadmap

import com.saymk.roadmap.model.Obstacle
import com.saymk.roadmap.model.Resource
import com.saymk.roadmap.model.Wolf
import com.saymk.roadmap.model.common.Coordinates

fun main() {
    println(Wolf(Coordinates(1, 9)))
    println(Obstacle.Rock(Coordinates(1, 9)))
    println(Obstacle.Tree(Coordinates(1, 9)))
    println(Resource.Grass(Coordinates(1, 9)))
}