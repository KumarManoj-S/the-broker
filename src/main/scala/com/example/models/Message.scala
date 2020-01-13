package com.example.models

import spray.json.DefaultJsonProtocol._
import spray.json.RootJsonFormat

case class Message(headers: String, data: String)

object Message {
  implicit val userJsonFormat: RootJsonFormat[Message] = jsonFormat2(Message.apply)
}