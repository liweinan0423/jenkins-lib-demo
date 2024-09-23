def call() {
	pipeline {
		node {
			stage("hello") {
				jobs.example1();
			}
		}
	}
}