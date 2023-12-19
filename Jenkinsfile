pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/kushgudhka/springCore-final.git'
                dir('01-Spring-Boot-Overview/01-Spring-Boot-Basics') {
                    bat "mvn clean test" 
                }
            }
        }
    }
}
