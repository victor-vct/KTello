package dev.victorvieira.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dev.victorvieira.ktello.ktello
import kotlinx.android.synthetic.main.activity_main.testFlightButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testFlightButton.setOnClickListener {
            testFlight()
        }

    }

    private fun testFlight() {
        ktello {
            connect()

            takeoff()

            Thread.sleep(5000)
            rotateClockwise(180)

            Thread.sleep(5000)
            land()
        }
    }
}
