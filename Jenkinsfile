pipeline {
    agent any
    tools{
        maven 'mvn'
        jdk 'jdk'
    }
    stages {
        stage('code'){
            steps{
                echo'coding'
        }
    }
    stage('build'){
        steps{
            echo'building'
            sh 'mvn clean'
            sh 'mvn install'
        }
    }
    
    stage('test'){
        steps{
            echo 'for testing'
            sh 'mvn test'
            
        }
    }

    stage('nexus'){
        steps{
            artifacts: [[artifactId: 'leetcode2', classifier: '', file: '.jar', type: 'leetcode2.jar']],
            nexusArtifactUploader credentialsId: '90058fbf-3833-43ee-889e-adec59741ce9',
            groupId: 'nexus', 
            nexusUrl: '34.236.153.106:8081',
            nexusVersion: 'nexus3', 
            protocol: 'http',
            repository: 'http://34.236.153.106:8081/repository/myrepo/',
            version: '3.41.1'
        }
    }
    
    stage('deploy'){
        steps{
            echo'deploying'
        }
    }
        stage('release'){
        steps{
            echo'releasing'
        }
        }
    }
}
