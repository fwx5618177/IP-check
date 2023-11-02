package com.IPCheck.service

import com.IPCheck.adapter.NetworkAdapter

class NetworkScanService {
    
    private val networkAdapter = NetworkAdapter()

    fun scan() {
        println("Scanning the network...")
        networkAdapter.displayIPAddresses()
    }

    fun scan(args: String) {
        println("Scanning the network...${args}")
        networkAdapter.displayIPAddresses()
    }
}
