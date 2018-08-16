package net.zero918nobita.api.controllers

import net.zero918nobita.api.Task
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("tasks")
class TaskController {
  @GetMapping("")
  fun index(model: Model): String {
    val tasks = listOf(
            Task(1, "wasmインタプリタを自作する", false),
            Task(2, "FirebaseのBlazeプランに登録する", false),
            Task(3, "MySQLのローカル開発環境を構築する", true))
    model.addAttribute("tasks", tasks)
    return "tasks/index"
  }
}
