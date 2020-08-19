package br.com.mastertech.couto.port

import br.com.mastertech.couto.port.configuration.RibbonConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.ribbon.RibbonClients
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClients(defaultConfiguration = [RibbonConfiguration::class])
class PortApplication

fun main(args: Array<String>) {
    runApplication<PortApplication>(*args)
}
