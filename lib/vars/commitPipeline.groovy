import jobs.*

example1 = new Example1();
def call() {
	pipeline {
		node {
			stage("hello") {
				example1();
			}
		}
	}
}