def call() {
    pipeline {
        node {
            stage('hello') {
                script {
                    sh'''
                echo Hello
                '''
                }
            }
        }
    }
}
