-- Table 1: ルーム情報を格納するテーブルを作成
CREATE TABLE `rooms` (
  `room_id` int NOT NULL AUTO_INCREMENT,
  `room_name` varchar(20) NOT NULL UNIQUE,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table 3: ユーザー情報を格納するテーブルを作成
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL UNIQUE,
  `user_screen_name` varchar(20) NOT NULL,
  `password` char(64) NOT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- サンプルレコードの挿入
INSERT INTO `users` (`name`, `password`) VALUES ('Matsumoto', 'E47089C9E704B549DD596AFD4345349A07533A0DD5021FB56D666DDB728B84C2');
