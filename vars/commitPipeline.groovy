def example1 = new com.mycompany.pipeline.Example1(this)		

def call() {
	pipeline {
		node {
			stage("hello") {
				example1();
			}
		}
	}
}