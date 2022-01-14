package com.lubinskiy.lesson15_16.animals

class Bird(name: String) : AnimalChordate(name), Fly, Swim {
    private val haveWings = true

    override fun live() {
        println("Creature: '$name' can live on the air and on the land, also have wings.")
    }

    override fun breathe() {
        println("$name breathe by the lungs.")
    }

    override fun info() {
        super.info()
    }

    override fun fly() {
        println("$name can fly.")
    }

    override fun swim() {
        println("$name can swim.")
    }
}
