### Proyecto Final para el Diplomado Desarrollo y despliegue de aplicaciones Cloud Native en ambientes híbridos
## Segunda Emisión 
_**Por: Leticia Rojas**_

## Proyecto
El presente microservicio, describe un CRUD hacia una base de datos de una librería.

##Arquitectura
! [Diagrama de Arquitectura](resources/arq.png) <br>
## Implementación
A continuación se describen  los accesos utilizados para Git, Docker y Mongo Cloud <br>
[Git] (https://github.com/ronlety/proyecto25.git Repositorio Personal ) <br>
[Docker Hub] (https://docker.io/ronlety Docker  Repositorio Personal) <br>
[Mongo Cloud] (http://admindba:gNe7c2wLFBJKgIdZ@cluster0.vboxk.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0 ) <br>

## Compilación

Esta desarrollada con JavaSpringBoot y Maven, por ello es necesario ejecutar los siguientes comandos para poder compilarlo.
´´´
#mvn clean
#mvn package .
´´´
## Pruebas

Para las pruebas locales se ejecuta en el navegador: <br>
´´´
GET http://localhost:8089/api/book/ 
´´´
! [Peticion GET] (resources/images/get.png)
Otro ejemplo con el ID para consultar la base seria: <br>
´´´
GET http://localhost:8089/api/book/6700d9e395f3b7c472884e4e
´´´
! [Peticion GET] (resources/images/get2.png) <br>
Para realizar un Borrado hacia la base de datos para un registro ser realiza: <br>
´´´
DELETE http://localhost:8089/delete/6700d9e395f3b7c472884e4e
´´´
![Borrado DELETE] (resources/images/delete.png)

La ejecuciñon de la imagen que contiene la aplicación se puede validar a través del comando CURL hacia la IP asignada al POD<br>
![Prueba Comando Curl] (resources/images/curl.png)

## Referencias 

[GitHub](https://github.com/ronlety85 Git  Repositorio Personal)
[Docker Hub] (https://docker.io/ronlety Docker  Repositorio Personal)
[OpenShift] (https://www.redhat.com/es/technologies/cloud-compluting/openshift OpenShift)

## Guías
[Docker] (https://docs.docker.com/)
[Kubectl] (https://kubernetes.io/es/docs/reference/kubectl/)
[Maven] (https://maven.apache.org/)
