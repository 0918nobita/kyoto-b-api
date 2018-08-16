package net.zero918nobita.api.controllers

import net.zero918nobita.api.Greeter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val greeter: Greeter) {
  @GetMapping("hello")
  fun hello(@RequestParam(value = "name", required = false) name: String) =
          greeter.hello(name)
}
