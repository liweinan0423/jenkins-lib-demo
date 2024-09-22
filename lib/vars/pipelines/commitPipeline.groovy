import jobs.Example1;

example1 = new Example1();
def call() {
	pipeline {
		agent any
		node {
			stage "hello" {
				example1.call();
			}
		}
	}
}