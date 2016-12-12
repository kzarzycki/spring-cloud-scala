package com.getindata.examples.spring

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@RefreshScope
@Component
case class Config(
                   @Value("${ConfigClient.message}") message: String
                 )