// import jobs.Example1;

def call() {
	example1 = new jobs.Example1();
	pipeline {
		agent any
		node {
			stage "hello" {
				example1.run();
			}
		}
	}
}