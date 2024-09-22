import jobs.Example1;

def call() {
	example1 = new Example1();
	pipeline {
		agent any
		node {
			stage "hello" {
				example1.call();
			}
		}
	}
}