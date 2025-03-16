###Pasos para el despliegue de una aplicación Java con Tekton <br>

##Tekton <br>

Esta herramienta opensource nos permite crear sistemas CI/CD, a través de GitHub en este ejemplo, nos pemite crear componentes YAML que pueden construit, clonar y desplegar aplicaciones usando nuestra infraestructura, en este caso el laboratorio de DGTIC.<br>
## Instalación de  Tekton <br>
Tekton ya tiene componentes que se pueden instalar y usar facilmente, hemos usado _**steps**_ , _**Tasks***_ <br>
Cada tarea ejecutada crea un pod. Para instalar una tarea conformada por etapas que hemos de ejecutar: <br>
 ' #kubectl apply -f  https://storage.googleapis.com/tekton-releases/pipelines/latest/release.yaml ' <br>

### Pasos para el despliegue de una aplicación Java con Tekton <br>
#Tekton <br>
Esta herramienta opensource nos permite crear sistemas CI/CD, a través de GitHub en este ejemplo, nos pemite crear componentes YAML que pueden construit, clonar y desplegar aplicaciones usando nuestra infraestructura, en este caso el laboratorio de DGTIC. <br>
## Instalación de componentes tasks de Tekton <br>
Tekton ya tiene componentes que se pueden instalar y usar facilmente, hemos usado _**steps**_ , _**Tasks***_ <br>
Cada tarea ejecutada crea un pod. Para instalar una tarea conformada por etapas que hemos de ejecutar: <br>
'  #kubectl create -f https://api.hub,tekton.dev/v1/resource/tekton/git-clone/0.9/raw -n diplo-rnl ' <br>
### Clonando desde repositorio Git  <br>
Para clonar el código desde nuestro repositorio, se utilizo el archivo yaml <br>
[TaskRun.yaml](manifests/git-clone/TaskRun.yaml) <br>
Se ejecuta con el comando: <br>
' #kubectl create -f TaskRun.yaml -n diplo-rnl ' <br>
Se valida que se hay ejecutado correstamente <br>
' #kubectl get taskrun -n diplo-rnl ' <br>
Si hubiera algun problema puedes detallar las bitácoras <br>
' #kubectl describe taskrun -n diplo-rnl ' <br>
Construyendo la imagen de la aplicación <br>

Una vez clonada, se utiliza la tarea maven que ofrece tekton <br>
[maven tekton](https://hub.tekton.dev/task/maven)
Se utilizo el archivo [mvn.yaml](manifest/git-clone/mvn-yaml) para ejecutar la tarea previamente instalada.<br>
![Ejecucion de maven](resources/images/build1.jpg) <br>
Se valida la correcta ejecuión con del comando <br>
' #kubectl get task -n diplo-rnl ' <br>
![Validación de tarea maven](resources/images/build2.jpng) <br>
' #kubectl create -f https://api.hub,tekton.dev/v1/resource/tekton/git-clone/0.9/raw -n diplo-rnl ' <br>
### Clonando desde repositorio Git  <br>
Para clonar el código desde nuestro repositorio, se utilizo el archivo yaml <br>
[TaskRun.yaml](manifests/git-clone/TaskRun.yaml) <br>
Se ejecuta con el comando: <br>
' #kubectl create -f TaskRun.yaml -n diplo-rnl ' <br>
Se valida que se hay ejecutado correstamente <br>
' #kubectl get taskrun -n diplo-rnl ' <br>
Si hubiera algun problema puedes detallar las bitácoras <br>
' #kubectl describe taskrun -n diplo-rnl ' <br>
Construyendo la imagen de la aplicación <br>

Una vez clonada, se utiliza la tarea maven que ofrece tekton, <br>
[maven tekton](https://hub.tekton.dev/task/maven) <br>
Se utilizo el archivo [mvn.yaml](manifest/git-clone/mvn-yaml) para ejecutar la tarea previamente instalada. <br>
![Ejecucion de maven](resources/images/build1.jpg) <br>
Se valida la correcta ejecuión con del comando <br>
' #kubectl get task -n diplo-rnl ' <br>
![Validación de tarea maven](resources/images/build2.jpng) <br>
### Colocando la imagen en el repositorio de Docker <br>

Para poder colocar la imagen compilada previamente es necesario crear un secret con los datos de conexion al repositorio de docker

'#kubectl create secret docker-registry dockersecret --docker-server=docker.io --docker-username=ronlety85 --docker-password='XXX' --docker-email=ronlety@gmail.com -n ' <br>
![secrets](resources/Captura de pantalla 2025-03-16 140541.png) <br>

### validando la ejecucion del pipeline <br>
Una vez que ya tenemos los artefactos creados, las tareas ejecutandose y validadas. <br>
YA creado el secrets para acceso al repositorio, ejecutamos el pipeline y validamos su ejecucion. <br>
![pipeline](resources/Captura de pantalla 2025-03-16 140214.png) >br>


'

