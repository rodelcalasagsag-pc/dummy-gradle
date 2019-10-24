import hudson.tasks.test.AbstractTestResultAction

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
        stage("Generate Allure Report") {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'build/allure-results']]
            }
        }
        stage("Report stats") {
            steps {
                echo printResult()
            }
        }
    }
}

def printResult(){
    final AbstractTestResultAction result = currentBuild.rawBuild.getAction(AbstractTestResultAction.class)
    def isNull = result == null
    return isNull.toString()
}