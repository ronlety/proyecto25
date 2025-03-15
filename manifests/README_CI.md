### Pasos para el despliegue de una aplicación Java con Tekton

## Tekton
<br>
Esta herramienta opensource nos permite  crear sistemas CI/CD, a través de GitHub en este ejemplo, nos pemite crear componentes YAML que pueden construit, clonar y desplegar aplicaciones usando nuestra infraestructura, en este caso el laboratorio de DGTIC.
<br>
## Instalación de componentes
<br>
Tekton ya tiene componentes que se pueden instalar y usar facilmente, hemos usado **steps** , **Tasks***
<br>
Cada tarea ejecutada crea un pod. Para instalar una tarea conformada por etapas  que hemos de ejecutar:
<br>
'
kubectl create -f https://api.hub.tekton.dev/v1/resource/tekton/git-clone/0.9/raw -n diplo-rnl
'
<br>
##  Clonando desde repositorio Git <br>
Para clonar el código desde nuestro repositorio, se utilizo el archivo yaml
<br>
[TaskRun.yaml](manifests/git-clone/TaskRun.yaml)
<br>
Se ejecuta con el comando:
<br>
'
#kubectl create -f TaskRun.yaml -n diplo-rnl
'
<br>
Se valida que se hay ejecutado correstamente
<br>
'
#kubectl get taskrun -n diplo-rnl
'
<br>
Si hubiera algun problema puedes detallar las bitácoras
<br>
'
#kubectl describe taskrun <nombre-de-taskrun> -n diplo-rnl
'
<br>

## Construyendo la imagen  de la aplicación <br>
<br>
Una vez clonada,  se utiliza la tarea maven que ofrece tekton,
<br> 
[maven tekton](https://hub.tekton.dev/task/maven)
<br>
Se utilizo el archivo [mvn.yaml](manifests/git-clone/mvn-yaml) para ejecutar la tarea previamente instalada.
<br>
![Ejecucion de maven](resources/images/build1.jpg)
<br>
Se valida la correcta ejecuión con del comando 
<br>
'
#kubectl get task -n diplo-rnl
'
<br>
![Validación de tarea maven](resources/images/build2.jpng)
<br>
