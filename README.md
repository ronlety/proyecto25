### Proyecto Final para el Diplomado Desarrollo y despliegue de aplicaciones Cloud Native en ambientes híbridos
## Segunda Emisión 
Por: Leticia Rojas <br>

## Proyecto <br>
El objetivo de ese microservicio es ejemplificar un CRUD hacia una base de datos Mongo resguarda a nube, la cual actualiza un
base de libros con sus autores. Desarrollada en Java Spring Boot y Maven. <br>
## Implementación
Para implementar la aplicación  se utilizan los comandos<br>
#mvn clean <br>
#mvn package <br>

## Ejecución <br>
La ejecución de la imagen que contiene la aplicación se puede validar a través del comando CURL <br>
#curl https://localhost:8089 <br>

## Pruebas <br>
Se realiza la peticiones a través del navegador <br>

#GET http://localhost:8089/api/book <br>
#GET http://localhost:8089/api/book/6700d9e395f3b7c472884e4e <br>
#DELETE http://localhost:8089/delete/6700d9e395f3b7c472884e4e <br>
 
## Referencias  <br>

[GitHub](https://github.com/ronlety/proyecto25  Git  Repositorio Personal) <br>
[Docker Hub] (https://docker.io/ronlety Docker  Repositorio Personal) <br>
[OpenShift] (https://www.redhat.com/es/technologies/cloud-compluting/openshift OpenShift) <br>

## Guías <br>
[Kubernetes](https://kubernetes.io/es/) <br>
[Maven](https://maven.apache.org) <br><br>
[SpringBoot](https://spring.io/projects/spring-boot) 

