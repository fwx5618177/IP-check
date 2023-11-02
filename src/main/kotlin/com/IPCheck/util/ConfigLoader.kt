package com.IPCheck.util

import java.io.IOException
import java.util.*

class ConfigLoader {
    private val properties = Properties()

    init {
        try {
            javaClass.classLoader.getResourceAsStream("application.properties")?.use {
                properties.load(it)
            } ?: println("Sorry, unable to find application.properties")
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    fun getProperty(key: String): String? {
        return properties.getProperty(key)
    }

    fun getIntProperty(key: String): Int {
        return properties.getProperty(key)?.toIntOrNull() ?: -1
    }
}