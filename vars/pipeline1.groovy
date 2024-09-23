def call() {
    pipeline {
        stage('hello') {
            script {
                sh'''
                echo Hello
                '''
            }
        }
    }
}
