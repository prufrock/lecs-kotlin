package com.dkanen.lecs

typealias ComponentId = EntityId

interface Component

class MetaComponent(): Component

data class Name(val name: String): Component

data class Id(var id: Int): Component

data class Position(var x: Double, val y: Double): Component

data class Velocity(val x: Double, val y: Double): Component

data class Health(val hp: Double): Component