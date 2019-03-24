# KTello
Simple kotlin library to control Tello drone using android app

## Drone Tello

Tello is a cheap drone made to fly easily. There is a good stability control that allows you to worry only about basic movements.

## KTello

This library can connect to Tello over the WiFi and send commands. You can find supported commands on [Tello SDK](https://dl-cdn.ryzerobotics.com/downloads/tello/0228/Tello+SDK+Readme.pdf).

## Getting Started

1. Connect a smartphone with [Android](https://www.android.com/) to your computer
2. Connect the smartphone to `Tello` drone
3. Clone this project
4. Navigate to project folder
5. In terminal, execute `./gradlew assembleDebug installDebug`

_**WARNING:**_ The sample app only execute a simple routine, check what the routine does.

## How to use

There is two options.

You can create an instance from `KTello`

``` kotlin
val ktello = Ktello()

ktello.connect()
ktello.takeoff()
ktello.land()
```
**OBS:** you need to run the commands on another `thread`.

Or you can use pre setted high order function and only use like this:

``` kotlin
ktello {
    connect()

    takeoff()

    Thread.sleep(5000)
    rotateClockwise(180)

    Thread.sleep(5000)
    land()
}
```
**OBS:** this function execute in a coroutine with global scope.


## TODO

- Read the Tello's returns
- Support take a photo
- Support video streamming
