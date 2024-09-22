import jobs.*

def call() {
	example1 = new Example1();
	pipeline {
		node {
			stage("hello") {
				example1();
			}
		}
	}
}