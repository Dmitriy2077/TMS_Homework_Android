package com.lubinskiy.lesson15_16.animals

open class Mammal(name: String) : AnimalChordate(name), MilkFeeding, Swim {
    var feedsMilk = true

    override fun live() {
        println("Creature: '$name' can live on the land or in the water(Cetacea).")
    }

    override fun breathe() {
        println("$name breathe by the lungs.")
    }

    override fun info() {
        super.info()
        milkFeeding()
        swim()
    }

    override fun milkFeeding() {
        println("$name feeding by milk in childhood to growing up.")
    }

    override fun swim() {
        println("$name can swim.")
    }
}
