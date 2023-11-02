package com.IPCheck.controller;

import com.IPCheck.service.NetworkScanService

class CommandController {
    private val networkScanService = NetworkScanService();

    fun start(args: Array<String>) {
        if (args.isEmpty()) {
            println("No arguments provided. Exiting.")
        } else {

            if (args.size < 2) {
                println("Please provide an IP address.")
                return
            }

            try {
                val result: String = when(args[0]) {
                    "scan" -> {
                        networkScanService.scan(args[1])
                        "scan"
                    }
                    "-s" -> {
                        networkScanService.scan(args[1])
                        "-s"
                    }   
                    else -> {
                        println("Invalid command.")
                        throw IllegalArgumentException("Invalid command: ${args[0]}")
                    }
                }
                println("Command: $result")
            } catch (e: Exception) {
                println(e.message)
            }  

        }
    }
}
