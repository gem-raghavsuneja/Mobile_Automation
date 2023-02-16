pipeline {
    agent any

  tools {
  gradle 'Gradle 8.0'
}


    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/gem-raghavsuneja/Mobile_Automation'


                bat './gradlew build'
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
