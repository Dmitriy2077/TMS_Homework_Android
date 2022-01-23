package com.lubinskiy.lesson15_16.animals;

class SwimBird(name: String) : AnimalChordate(name), Swim {
    private val haveSmallWings = true

    override fun live() {
        println("Creature: '$name' can live on the land and under the water, also have wings.")
    }

    override fun breathe() {
        println("$name breathe by the lungs.")
    }

    override fun info() {
        super.info()
        swim()
    }

    override fun swim() {
        println("$name can swim.")
    }
}
