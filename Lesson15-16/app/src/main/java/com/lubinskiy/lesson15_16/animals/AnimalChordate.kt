package com.lubinskiy.lesson15_16.animals

abstract class AnimalChordate(val name: String) {
    val brain = true
    val backbone = true

    abstract fun live()

    abstract fun breathe()

    open fun info() {
        live()
        breathe()
    }
}
