package pipelines;

def call() {
	pipeline {
		node {
			stage("hello") {
				example1();
			}
		}
	}
}