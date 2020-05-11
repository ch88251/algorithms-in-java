pipeline {
  agent { docker { image 'maven:3.3.3' } }
  stages {
    stage('unit tests') {
      steps {
        sh 'mvn clean verify'
      }
    }
  }
}
