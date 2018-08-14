package net.zero918nobita.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val greeter: Greeter) {
  @GetMapping("hello")
  fun hello(@RequestParam("name") name: String): String = greeter.hello(name)
}
