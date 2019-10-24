pipeline {
    agent any
    stages {
        stage("Clean") {
            steps {
                bat "gradlew.bat clean"
            }
        }
        stage("Run Suite 1") {
            steps {
                bat "gradlew.bat test -Psuite1"
            }
        }
        stage("Run Suite 2") {
            steps {
                bat "gradlew.bat test -Psuite2"
            }
        }
        stage("Generate Report") {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'build/allure-results']]
            }
        }
    }
}