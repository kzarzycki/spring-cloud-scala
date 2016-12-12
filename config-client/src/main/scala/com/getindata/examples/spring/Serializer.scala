package com.getindata.examples.spring

import org.springframework.cloud.context.config.annotation.RefreshScope

@RefreshScope
trait Serializer {
  def serialize(msg: String): String
}

@RefreshScope
class JsonSerializer extends Serializer {
  override def serialize(msg: String) = s"""{ "msg":"$msg" }"""
}

@RefreshScope
class XmlSerializer extends Serializer {
  override def serialize(msg:String) = s"""<msg>$msg</msg>"""
}