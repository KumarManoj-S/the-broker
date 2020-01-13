package com.example

import akka.http.scaladsl.server.Directives.{complete, get, path}
import akka.http.scaladsl.server.Route
import com.example.models.Message
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._

object Routes {
  def getRoutes: Route = {
    val routes =
      path("payload") {
        get {
          complete(Message("headers", "body data"))
        }
      }
    routes
  }
}
