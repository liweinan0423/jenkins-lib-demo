package com.mycompany.pipeline;

class Example1 {
	def steps
	public Example1(steps) {
		this.steps = steps
	}

	void call() {
		steps.script {
			steps.sh"""
				echo Hello
			"""
		}
	}
}