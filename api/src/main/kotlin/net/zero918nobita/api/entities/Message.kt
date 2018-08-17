package net.zero918nobita.api.entities

import java.sql.Date

data class Message(val messageId: Long,
                   val senderId: Long,
                   val roomId: Long,
                   val content: String,
                   val created: Date)
