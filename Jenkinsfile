pipeline {
  agent { label 'jdk-8' }
  stages {
    stage('SCM Checkout') {
      steps {
        git 'https://github.com/ch88251/algorithms-in-java.git'
      }
    }
    stage('unit tests') {
      steps {
        sh 'mvn clean verify'
      }
    }
  }
}
