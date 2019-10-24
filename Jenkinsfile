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
                try {
                    bat "gradlew.bat test -Psuite1"
                }
                finally {
                    allure includeProperties: false, jdk: '', results: [[path: 'build/allure-results']]
                }
            }
        }
        stage("Run Suite 2") {
            steps {
                try {
                    bat "gradlew.bat test -Psuite2"
                }
                finally {
                    allure includeProperties: false, jdk: '', results: [[path: 'build/allure-results']]
                }
            }
        }
    }
}