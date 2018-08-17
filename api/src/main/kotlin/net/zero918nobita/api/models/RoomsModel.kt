package net.zero918nobita.api.models

import net.zero918nobita.api.entities.Room
import java.sql.ResultSet

object RoomsModel: Model<Room> {
  override fun stereotype(resultSet: ResultSet): List<Room> {
    val result = mutableListOf<Room>()
    while (resultSet.next()) {
      result.add(Room(roomId = resultSet.getLong(1),
              roomName = resultSet.getString(2)))
    }
    return result
  }
}
