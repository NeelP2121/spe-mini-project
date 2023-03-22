pipeline {
    agent any
    
    environment {
        registry = "neelabhpb/spe-mini-project2023"
        registryCredential = "dockerhub"
        dockerImage = ""
    }
    stages {
        stage('Git Pull') {
            steps {
                // Pulls code from my github repo
                git url: 'https://github.com/NeelP2121/spe-mini-project.git', branch: 'main'
            }
        }
        stage('Build project') {
            steps {
                // Builds the project(repo) that was pulled using appropriate maven command
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }    
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Deploy using ansible'){
            steps{
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'mini-project-playbook.yml'
            }
        }
    }
}
