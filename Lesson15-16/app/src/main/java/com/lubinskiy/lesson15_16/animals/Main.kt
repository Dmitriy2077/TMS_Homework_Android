package com.lubinskiy.lesson15_16.animals

fun main() {
    val birdNotFly = Bird("Penguin")
    birdNotFly.info()
    birdNotFly.swim()

    val birdFly = Bird("Swan")
    birdFly.info()
    birdFly.fly()

    val fishNotFly = Fish("Shark")
    fishNotFly.info()

    val fishFly = Fish("Japanese Flying Fish")
    fishFly.info()
    fishFly.fly()

    val mammal = Mammal("Camel")
    mammal.info()
}
