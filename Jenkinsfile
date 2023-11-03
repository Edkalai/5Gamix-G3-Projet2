pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
            	git branch: 'KalaiAhmed-5Gamix-G3',
                git url: 'https://github.com/Edkalai/5Gamix-G3-Projet2.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -D maven.test.skip=true'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
}
