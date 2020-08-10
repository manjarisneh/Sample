#!groovy
node {
    stage('Git checkout') { // for display purposes
        git 'https://github.com/manjarisneh/Sample.git'
    }

    stage('API') {
        try {
            sh "mvn clean verify -Dtags='type:API'"
        } catch (err) {

        } finally {
            publishHTML (target: [
                    reportDir: 'target/reports',
                    reportFiles: 'index.html',
                    reportName: "Smoke tests report"
            ])
        }
    }

    stage('UI') {
        try {
            sh "mvn clean verify -Dtags='type:UI'"
        } catch (err) {

        } finally {
            publishHTML (target: [
                    reportDir: 'target/reports',
                    reportFiles: 'index.html',
                    reportName: "Smoke tests report"
            ])
        }
    }}