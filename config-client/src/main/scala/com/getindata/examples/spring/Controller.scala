package com.getindata.examples.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@Autowired
class Controller  (config: Config, serializer: Serializer) {

  @RequestMapping(Array("/"))
  def home: String = serializer.serialize(s"Hello ${config.message}")

}
