package com.getindata.examples.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean


@SpringBootApplication
class ConfigClient @Autowired() (config: Config) {

  @Bean
  @ConditionalOnProperty(name = Array("serializer"), havingValue = "json")
  def jsonSerializer = new JsonSerializer

  @Bean
  @ConditionalOnProperty(name = Array("serializer"), havingValue = "xml")
  def xmlSerializer = new XmlSerializer
}

object ConfigClient extends App {
  SpringApplication.run(classOf[ConfigClient], args: _*)
}


