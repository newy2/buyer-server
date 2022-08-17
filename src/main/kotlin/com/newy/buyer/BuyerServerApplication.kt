package com.newy.buyer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuyerServerApplication

fun main(args: Array<String>) {
    runApplication<BuyerServerApplication>(*args)
}
