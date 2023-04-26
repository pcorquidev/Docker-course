# pagina para verificar un yml
https://www.yamllint.com/

# comando para levantar el archivo docker compose
docker-compose up -d 

# comando para levantar el archivo docker compose y construir las imagenes
docker compose up -d --build

# para levantar un container existente por nombre de servicio
docker-compose start api-java

# acceder a los logs
docker-compose logs api-java

# mostrar los logs con seguimiento
docker-compose logs -f api-java

# para detener los servicios
docker-compose down

# para detener un solo servicio
docker compose stop api-java

# levantar otro container de acuerdo a un servicio
docker compose run -d -p 8081:80 my-server 

# entrar al servicio con exec
docker compose exec my-server bash