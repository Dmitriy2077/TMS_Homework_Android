package com.lubinskiy.lesson15_16.animals

class Fish(name: String) : AnimalChordate(name), Swim {
    val haveGills = true

    override fun live() {
        println("Creature: '$name' live under the water.")
    }

    override fun breathe() {
        println("$name breathe by the gills.")
    }

    override fun info() {
        super.info()
        swim()
    }

    override fun swim() {
        println("$name can swim.")
    }
}
