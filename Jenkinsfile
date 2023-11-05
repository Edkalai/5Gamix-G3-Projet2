pipeline {
    agent any
    
    
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Run Unit Tests') {
            steps {
                 
                    script {
                        sh 'mvn clean install' 
                    }
                
            }
        }
        stage('Login Docker') {
        steps {
        script {
            sh 'echo 191JMT3507 | docker login -u oubeid12 --password-stdin'
                }
            }
        }      
        
        

        stage('Build & Push Docker Image ') {
            steps {
                
                    script {
                        sh 'docker build -t oubeid12/back .'
                        sh 'docker push oubeid12/back'
                    }
                }
            }
    }}