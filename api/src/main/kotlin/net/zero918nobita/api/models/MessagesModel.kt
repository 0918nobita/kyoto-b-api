package net.zero918nobita.api.models

import net.zero918nobita.api.entities.Message
import java.sql.ResultSet

object MessagesModel: Model<Message> {
  override fun stereotype(resultSet: ResultSet): List<Message> {
    val result = mutableListOf<Message>()
    while (resultSet.next()) {
      result.add(Message(messageId = resultSet.getLong(1),
                         senderId = resultSet.getLong(2),
                         roomId = resultSet.getLong(3),
                         content = resultSet.getString(4),
                         created = resultSet.getDate(5)))
    }
    return result
  }
}
