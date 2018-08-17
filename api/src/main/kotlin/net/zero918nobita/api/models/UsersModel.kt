package net.zero918nobita.api.models

import net.zero918nobita.api.entities.User
import java.sql.ResultSet

object UsersModel: Model<User> {
  fun findAllUsers(): List<User> {
    val stmt = Database.connection.createStatement()
    stmt.executeQuery("SELECT * FROM users")
    return stereotype(stmt.resultSet)
  }

  override fun stereotype(resultSet: ResultSet): List<User> {
    val result = mutableListOf<User>()
    while (resultSet.next()) {
      result.add(User(userId = resultSet.getLong(1),
              userName = resultSet.getString(2),
              userScreenName = resultSet.getString(3),
              password = resultSet.getString(4)))
    }
    return result
  }
}
