package net.zero918nobita.api.models

import java.sql.ResultSet

interface Model<T> {
  /**
   * クエリーの実行結果をエンティティのリストに変換する
   */
  fun stereotype(resultSet: ResultSet): List<T>
}
