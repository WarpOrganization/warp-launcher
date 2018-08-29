node {
    stage('Prepare') {
        properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '20')),
                    disableConcurrentBuilds()])
        checkout scm
        sh './gradlew clean'
    }

    stage('Build') {
        sh './gradlew jar'
    }

    stage('Archive') {
        archiveArtifacts 'build/libs/*.jar'
    }
}