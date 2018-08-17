package net.zero918nobita.api.controllers

import net.zero918nobita.api.models.UsersModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class UsersController {
  @GetMapping("users")
  fun index() = UsersModel.findAllUsers()
}
