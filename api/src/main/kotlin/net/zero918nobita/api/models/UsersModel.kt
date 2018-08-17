package net.zero918nobita.api.models

import net.zero918nobita.api.entities.User

object UsersModel {
  fun findAllUsers(): List<User> {
    val stmt = SqlExecutor.connection.createStatement()
    stmt.executeQuery("SELECT * FROM users")
    val resultSet = stmt.resultSet

    val result = mutableListOf<User>()
    while (resultSet.next()) {
      result.add(User(id = resultSet.getLong(1),
                      userName = resultSet.getString(2),
                      userScreenName = resultSet.getString(3),
                      password = resultSet.getString(4)))
    }

    return result
  }
}
