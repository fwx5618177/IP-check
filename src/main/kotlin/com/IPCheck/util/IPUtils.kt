package com.IPCheck.util

import java.net.InetAddress

object IPUtils {
    fun getHostname(ipAddress: String): String? {
        return try {
            val inetAddress = InetAddress.getByName(ipAddress)
            inetAddress.hostName
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun isIPv4(ipAddress: String): Boolean = ipAddress.contains(".") && ipAddress.split(".").size == 4

    fun isIPv6(ipAddress: String): Boolean = ipAddress.contains(":")
}
