### Proyecto Final para el Diplomado Desarrollo y despliegue de aplicaciones Cloud Native en ambientes híbridos
## Segunda Emisión 
Por: Leticia Rojas

## Proyecto
El objetivo de ese microservicio es ejemplificar un CRUD hacia una base de datos Mongo resguarda a nube, la cual actualiza un
base de libros con sus autores. Desarrollada en Java Spring Boot y Maven. 
## Implementación
Para implementar la aplicación  se utilizan los comandos
#mvn clean
#mvn package .

## Ejecución
La ejecución de la imagen que contiene la aplicación se puede validar a través del comando CURL
#curl https://localhost:8089
! []
## Pruebas
Se realiza la peticiones a través del navegador

#GET http://localhost:8089/api/book
#GET http://localhost:8089/api/book/6700d9e395f3b7c472884e4e
#DELETE http://localhost:8089/delete/6700d9e395f3b7c472884e4e
 
## Referencias 

[GitHub](https://github.com/ronlety/proyecto25  Git  Repositorio Personal)
[Docker Hub] (https://docker.io/ronlety Docker  Repositorio Personal)
[OpenShift] (https://www.redhat.com/es/technologies/cloud-compluting/openshift OpenShift)

## Guías
[Kubernetes](https://kubernetes.io/es/)
[Maven](https://maven.apache.org)
[SpringBoot](https://spring.io/projects/spring-boot)

