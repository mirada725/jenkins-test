pipeline {
    agent any

    stages {
        stage('Create Directory') {
            steps {
                script {
                    // Use 'bat' for Windows to create a directory (example: C:\mydir)
                    bat 'mkdir C:\\mydir'
                }
            }
        }
    }
}
