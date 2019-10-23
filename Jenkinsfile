pipeline {
    agent any
    stages {
        stage("Clean") {
            steps {
                bat "gradlew.bat clean"
            }
        }
        stage("Test") {
            steps {
                bat "gradlew.bat test"
            }
        }
    }
}