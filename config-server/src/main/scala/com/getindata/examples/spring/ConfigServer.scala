package com.getindata.examples.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigServer

object ConfigServer extends App {
  SpringApplication.run(classOf[ConfigServer], args: _*)
}
