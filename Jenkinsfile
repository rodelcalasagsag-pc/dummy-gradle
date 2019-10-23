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
                sleep 1
                bat "gradlew.bat allureReport"
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'build/reports/allure-report', reportFiles: 'index.html', reportName: 'Allure Report', reportTitles: ''])
            }
        }
        stage("Report stats"){
            steps{
                echo currentBuild.currentResult
            }
        }
    }
}