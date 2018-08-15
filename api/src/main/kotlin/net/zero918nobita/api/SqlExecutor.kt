package net.zero918nobita.api

import java.sql.Connection
import java.sql.DriverManager

object SqlExecutor {
  private var connection: Connection

  init {
    Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance()
    connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", Config.username, Config.password)
  }

  fun findAll(): List<String> {
    val stmt = connection.createStatement()
    stmt.executeQuery("SELECT * FROM users")
    val resultSet = stmt.resultSet
    val result = mutableListOf<String>()
    while (resultSet.next()) {
      result.add(resultSet.getString(1) + ": " + resultSet.getString(2))
    }
    return result
  }
}
