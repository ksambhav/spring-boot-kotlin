package com.samsoft

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/*@Import(
        CrmModule::class,
        InventoryModule::class
)*/
@SpringBootApplication
class MyApplication

fun main(args: Array<String>) {
    SpringApplication.run(MyApplication::class.java)
}