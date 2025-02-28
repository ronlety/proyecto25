Modulo 5 -  Maven <br>
Por : Leticia Rojas Nava<br>

Se instala  la tarea MAVEN del hub de Tekton <br>
***kubectl apply -f https://api.hub.tekton.dev/v1/resource/tekton/task/maven/0.4/raw*** <br>
 ![Alt Text] (https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/images/build1.jpg) <br>
Se valida que se tenga instalada la tarea MAVEN del hub de Tekton <br>
***kubectl get task -n diplo-rnl *** <br>
  <br>
 ![Alt Text] https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/image/sbuild2.jpg) <br>

Se obtiene el setting.xml en el repositorio de mi home $HOME/.m2/settings.xml <br>

 ![Alt Text] (https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/images/build3.jpg) <br>
Se copia a git-clone y se genera el archivo configmap importante el nombre maven-setting porque se hace referencia en el TaskRun mv-seting.yaml <br>
--- kubectl create -f configmap maven-settings --from=settings.xml --- <br>

 ![Alt Text] https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/images/build4.jpg) <br>
Se valida que este generado el PVC workspace-4 <br>
*** kubectl get pvc -n diplo-rnl *** <br>
 ![Alt Text] (https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/images/build5.jpg) <br>
Se ejecuta el taskrun mv-seting.xml, donde se corrige el name: output por el name: source <br>
Previamente debería de estar ejecutándose las tareas git-clone-XXX para que existan los PODS a afectar. <br>
*** kubectl get taskrun -n diplo-rnl *** <br>
 ![Alt Text] (https://github.com/ronlety/proyecto25/tree/feature/continuos-deployment/resources/images/build6.jpg) <br>
