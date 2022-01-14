package com.lubinskiy.lesson15_16.animals

class Fish(name: String) : AnimalChordate(name), Swim, Fly {
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

    override fun fly() {
        println("$name can fly a little.")
    }
}
