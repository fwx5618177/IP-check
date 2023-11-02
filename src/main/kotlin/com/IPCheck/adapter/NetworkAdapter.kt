package com.IPCheck.adapter

import java.net.NetworkInterface
import java.util.*

class NetworkAdapter {

    fun getIPAddresses(): List<String> {
        val ipAddresses = mutableListOf<String>()
        try {
            val networkInterfaces = NetworkInterface.getNetworkInterfaces()
            while (networkInterfaces.hasMoreElements()) {
                val networkInterface = networkInterfaces.nextElement()
                val inetAddresses = networkInterface.inetAddresses
                while (inetAddresses.hasMoreElements()) {
                    val inetAddress = inetAddresses.nextElement()
                    ipAddresses.add(inetAddress.hostAddress)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ipAddresses
    }

    fun displayIPAddresses() {
        val ipAddresses = getIPAddresses()
        if (ipAddresses.isEmpty()) {
            println("No IP addresses found.")
        } else {
            println("IP Addresses:")
            ipAddresses.forEach { println(it) }
        }
    }
}
