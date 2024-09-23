package com.mycompany.pipeline;

class Example1 {
	def steps
	public Example1(steps) {
		this.steps = steps
	}

	void execute() {
		steps.script {
			steps.sh"""
				echo Hello
			"""
		}
	}
}