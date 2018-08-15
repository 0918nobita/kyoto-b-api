package net.zero918nobita.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class UsersController {
  @GetMapping("users")
  fun index() = SqlExecutor.findAll()
}
