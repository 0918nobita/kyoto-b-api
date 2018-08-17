package net.zero918nobita.api.models

import java.sql.Connection
import java.sql.DriverManager

object SqlExecutor {
  var connection: Connection

  init {
    Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance()
    connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", Config.username, Config.password)
  }
}
