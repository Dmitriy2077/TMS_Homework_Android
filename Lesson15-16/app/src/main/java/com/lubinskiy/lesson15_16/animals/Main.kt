package com.lubinskiy.lesson15_16.animals

fun main() {
    val birdSwim = SwimBird("Penguin")
    birdSwim.info()

    val bird = Bird("Swan")
    bird.info()

    val fish = Fish("Shark")
    fish.info()

    val fishFly = FlyFish("Japanese Flying Fish")
    fishFly.info()

    val mammal = Mammal("Camel")
    mammal.info()
}
