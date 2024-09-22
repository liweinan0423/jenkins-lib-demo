example1 = library("jenkins-shared-library-examples").example1
pipeline {
	agent "any"
	node {
		stage("hello world") {
			example1("Bob")
		}
	}
}