Modulo 5 -  Maven <p>
Por : Leticia Rojas Nava<p>

Se instala  la tarea MAVEN del hub de Tekton <p>
'''kubectl apply -f https://api.hub.tekton.dev/v1/resource/tekton/task/maven/0.4/raw''' <p>
 ![Alt Text] (/resources/images/build1.jpg) <p>
Se valida que se tenga instalada la tarea MAVEN del hub de Tekton <p>
'''kubectl get task -n diplo-rnl ''' <p>
  <p>
 ![Alt Text] (/resources/images/build2.jpg) <p>

Se obtiene el setting.xml en el repositorio de mi home $HOME/.m2/settings.xml <p>

 ![Alt Text] (/resources/images/build3.jpg) <p>
Se copia a git-clone y se genera el archivo configmap importante el nombre maven-setting porque se hace referencia en el TaskRun mv-seting.yaml <p>
''' kubectl create -f configmap maven-settings --from=settings.xml ''' <p>

 ![Alt Text] (/resources/images/build4.jpg) <p>
Se valida que este generado el PVC workspace-4 <p>
''' kubectl get pvc -n diplo-rnl ''' <p>
 ![Alt Text] (/resources/images/build5.jpg) <p>
Se ejecuta el taskrun mv-seting.xml, donde se corrige el name: output por el name: source <p>
Previamente debería de estar ejecutándose las tareas git-clone-XXX para que existan los PODS a afectar. <p>
''' kubectl get taskrun -n diplo-rnl ''' <p>
 ![Alt Text] (/resources/images/build6.jpg) <p>
