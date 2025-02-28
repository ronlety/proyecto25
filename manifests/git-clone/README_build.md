Modulo 5 -  Maven
Por : Leticia Rojas Nava

Se instala  la tarea MAVEN del hub de Tekton
'''kubectl apply -f https://api.hub.tekton.dev/v1/resource/tekton/task/maven/0.4/raw'''
 [[resources/images/build1.jpg]]
Se valida que se tenga instalada la tarea MAVEN del hub de Tekton
'''kubectl get task -n diplo-rnl '''
 [[resources/images/build2.jpg]]
Se obtiene el setting.xml en el rpositorio de mi home $HOME/.m2/settings.xml
  [[resources/images/build3.jpg]]
Se copia a git-clone y se genera el archivo configmap importante el nombre maven-setting porque se hace referencia en el TaskRun mv-seting.yaml
''' kubectl create -f configmap maven-settings --from=settings.xml '''
  [[resources/images/build4.jpg]]

Se valida que este generado el PVC workspace-4
''' kubectl get pvc -n diplo-rnl '''
  [[resources/images/build5.jpg]]
Se ejecuta el taskrun mv-seting.xml, donde se corrige el name: output por el name: source
Previamente debería de estar ejecutándose las tareas git-clone-XXX para que existan los PODS a afectar.
''' kubectl get taskrun -n diplo-rnl '''


  [[resources/images/build6.jpg]]
