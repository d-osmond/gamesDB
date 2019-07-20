package com.example.gamesDB

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication

class Application{


    @Bean
    fun run(repository: DeviceRepository) = ApplicationRunner {

        repository.save(Device(
                deviceName = "Playstation",
                platform = "Playstation 4",
                format = "Physical"
        ))
    }
}

fun main(args: Array<String>){

    runApplication<Application>(*args)
}

fun start(){

    runApplication<Application>()
}
