def call() {
	pipeline {
		agent any
		node {
			stage "hello" {
				script {
				sh """
					echo "Hello"
				"""
				}
			}
		}
	}
}