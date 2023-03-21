pipeline {
    agent any

   tools {
  gradle 'Gradle 8.0.2'
}

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/gem-raghavsuneja/Mobile_Automation'

                bat 'gradle clean test aggregate reports -Dcucumber.filter.tags="@%Tags%"'
            }

           
        }
    }
}
