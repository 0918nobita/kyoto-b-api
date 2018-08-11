# kyoto-b-api

kyoto-b チームのサーバーサイドについて

## 開発環境構築

### ソースファイルを準備する

```bash
$ git clone https://github.com/0918nobita/kyoto-b-api.git
$ cd kyoto-b-api
```

### mariaDB の Docker イメージの導入

docker-compose.yml

```yml
version: '2'
services:
  db:
    build: ./db/
    environment:
      MYSQL_ROOT_PASSWORD: your_password
      MYSQL_DATABASE: your_schema
    ports:
      - "3306:3306"
  app:
    build: ./app/
    ports:
      - "8080:80"
    links:
      - db
    volumes:
      - ./src:/var/www/html
    stdin_open: true
    tty: true
```
