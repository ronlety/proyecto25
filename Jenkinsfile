pipeline{
    agent any
    tools {
       maven 'maven'
       jdk 'JDK17'
    }
    environment {
       DOCKERHUB_CREDENTIALS = credentials('ronlety')
       DOCKER_IMAGE = 'ronlety85/proyecto:v9'
    }

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                echo "PATH = ${PATH}"
                echo "JAVA_HOME = ${M2_HOME}"
                java -version
                echo "** starting notification compilation"
		mvn clean package
                echo "** end notification compilation"
                '''
            }       
        }
    stage ('Build'){
       steps {
          sh ' sudo docker build -t ${DOCKER_IMAGE} . '
       }
    } 
    stage ('Login & Push')
    {
     steps {
         sh '''
            echo $DOCKERHUB_CREDENTIALS_PSW | sudo docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin docker.io
            sudo docker push ${DOCKER_IMAGE}
         '''
     }
    }
  } 
} 

