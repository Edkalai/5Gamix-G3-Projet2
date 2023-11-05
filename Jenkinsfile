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
    }}