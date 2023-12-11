## Run Db
<i>Projeto criado para exemplificar formas de se rodar uma query no banco de dados a parti do código java.</i>

### Iniciar banco MYSQL utilizando container docker (podman)
```
podman run --name meu-mysql -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=teste -e MYSQL_USER=user_teste -e MYSQL_PASSWORD=usertest123 -p 3306:3306 -d mysql:latest
```