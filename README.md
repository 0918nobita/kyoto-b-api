# kyoto-b-api

kyoto-b チームのサーバーサイドについて

## 開発環境構築

### ソースファイルを準備する

```bash
# ソースコードを取得する
$ git clone https://github.com/0918nobita/kyoto-b-api.git
$ cd kyoto-b-api
```

### MySQL 仮想環境を準備する

```bash
# ./docker-compose.yml からコンテナをビルドする
$ docker-compose build

# コンテナをバックグランドで実行する
$ docker-compose up -d
```
