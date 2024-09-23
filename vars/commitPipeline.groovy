def call() {
	def example1 = new com.mycompany.pipeline.Example1(this)
	pipeline {
		node {
			stage("hello") {
				example1();
			}
		}
	}
}