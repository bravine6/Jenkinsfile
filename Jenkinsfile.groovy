pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build is successful!'
            }
            post{
                success {
                    mail to: "mickybravine@gmail.com",
                    subject: "Build Status email",
                    body: "Build is successful!"
                }
            }
        }
    }
}