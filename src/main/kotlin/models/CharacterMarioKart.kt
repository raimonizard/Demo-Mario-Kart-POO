package models

class CharacterMarioKart {
    var name: String = "Unknown"
    var speed: Float = 0.0f
    var acceleration: Float = 0.0f
    var weight: Float = 0.0f
    var handling: Float = 0.0f
    var traction: Float = 0.0f

    constructor(name: String){
        this.name = name
    }

    constructor(name: String, speed: Float, acceleration: Float, weight: Float, handling: Float, traction: Float) {
        this.name = name
        this.speed = speed
        this.acceleration = acceleration
        this.weight = weight
        this.handling = handling
        this.traction = traction
    }

    override fun toString(): String {
        return "CharacterMarioKart(name='$name', speed=$speed, acceleration=$acceleration, weight=$weight, handling=$handling, traction=$traction)"
    }
}