pipeline {
    agent any

  tools {
  gradle 'Gradle 8.0'
}


    stages {
        stage('Build') {
            steps {
                //Get some code from a GitHub repository
                git 'https://github.com/gem-raghavsuneja/Mobile_Automation'
                bat './gradlew build'
            }

          }
        }
    

}

