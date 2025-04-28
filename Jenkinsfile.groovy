pipeline {
    agent any
    environment {
        NAME = "Bravine"
    }
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
        stage('Test') {
            steps {
                echo 'Test started and completed'
            }
        }
        stage('Deploy') {
            steps {
                echo "${env.NAME} Deploy started and completed"
            }
        }
        stage('Completed') {
            steps {
                echo 'Test started and completed'
            }
        }
    }
}
