package net.zero918nobita.api.models

import java.sql.ResultSet
import net.zero918nobita.api.entities.Pair

object PairsModel: Model<Pair> {
  override fun stereotype(resultSet: ResultSet): List<Pair> {
    val result = mutableListOf<Pair>()
    while (resultSet.next()) {
      result.add(Pair(roomId = resultSet.getLong(1),
                      userId1 = resultSet.getLong(2),
                      userId2 = resultSet.getLong(3)))
    }
    return result
  }
}
