package dev.victorvieira.ktello

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

private const val TAG = "Ktello"

fun ktello(func: KTello.() -> Unit) = KTello().apply {
    GlobalScope.launch {
        func()
    }
}

class KTello {

    private val tello = Tello()

    fun connect() {
        tello.send("command")
    }

    fun takeoff() {
        tello.send("takeoff")
    }

    fun land() {
        tello.send("land")
    }

    fun up(upwardMore: Int) {
        tello.send("up $upwardMore")
    }

    fun down(downwardMore: Int) {
        tello.send("down $downwardMore")
    }

    fun left(flyLeft: Int) {
        tello.send("left $flyLeft")
    }

    fun right(flyRight: Int) {
        tello.send("right $flyRight")
    }

    fun forward(flyForward: Int) {
        tello.send("forward $flyForward")
    }

    fun back(flyBack: Int) {
        tello.send("back $flyBack")
    }

    fun rotateClockwise(rotateInDegree: Int) {
        tello.send("cw $rotateInDegree")
    }

    fun rotateCounterClockwise(rotateInDegree: Int) {
        tello.send("ccw $rotateInDegree")
    }

    fun flipRight() {
        tello.send("flip r")
    }

    fun flipLeft() {
        tello.send("flip l")
    }

    fun flipForward() {
        tello.send("flip f")
    }

    fun flipBack() {
        tello.send("flip b")
    }

    fun flipBackLeft() {
        tello.send("flip bl")
    }

    fun flipBackRight() {
        tello.send("flip rb")
    }

    fun flipFrontRight() {
        tello.send("flip fr")
    }

    fun flipFrontLeft() {
        tello.send("flip fl")
    }

    fun setSpeed(speedCmPerSecond: Int) {
        tello.send("speed $speedCmPerSecond")
    }

}