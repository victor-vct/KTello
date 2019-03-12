package dev.victorvieira.ktello

import android.util.Log
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.SocketTimeoutException

private const val PORT_CONNECTION = 8889
private const val TELLO_IP_ADDRESS = "192.168.10.1"
private const val TAG = "Tello_Drone"

class Tello {

    private val udpSocket = DatagramSocket(PORT_CONNECTION)
    private val server = InetAddress.getByName(TELLO_IP_ADDRESS)

    fun send(command: String) {
        val packet = DatagramPacket(command.toByteArray(), command.toByteArray().size, server, 8889)
        Log.d(TAG, "Sending...")
        udpSocket.send(packet)
        checkResponse()
    }

    private fun checkResponse() {
        val message = ByteArray(8000)
        val packet = DatagramPacket(message, message.size)
        Log.i(TAG, "Waiting checkResponse...")
        udpSocket.soTimeout = 5000
        try {
            udpSocket.receive(packet)
            val text = String(message, 0, packet.length)
            Log.d(TAG, text)
        } catch (error: SocketTimeoutException) {
            Log.d(TAG, "Timeout :(")
        }
    }

}