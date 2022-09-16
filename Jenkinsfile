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
        nexusArtifactUploader artifacts: [[artifactId: 'leetcode2',
         classifier: '',
          file: 'maven.compiler.source', 
          type: 'war']], 
          credentialsId: '90058fbf-3833-43ee-889e-adec59741ce9', 
          groupId: 'com.leetcode2', 
          nexusUrl: '172.31.29.6:8081', 
          nexusVersion: 'nexus3', 
          protocol: 'http', 
          repository: 'http://34.236.153.106:8081/repository/nexus_spring/', version: '1.0.0'
    }
}
