package com.samsoft.app

import com.samsoft.crm.CrmModule
import com.samsoft.inventory.InventoryModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@Import(
        CrmModule::class,
        InventoryModule::class
)
@SpringBootApplication
class MyApplication

fun main(args: Array<String>) {
    SpringApplication.run(MyApplication::class.java)
}