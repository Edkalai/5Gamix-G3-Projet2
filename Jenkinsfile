pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Edkalai/5Gamix-G3-Projet2.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true' // Skip tests
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
}
