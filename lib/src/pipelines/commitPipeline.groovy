import jobs.example1;

def call() {
	pipeline {
		agent any
		node {
			stage "hello" {
				example1
			}
		}
	}
}