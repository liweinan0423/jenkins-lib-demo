package jobs;

public class Example1 {
	def call(String name = "Alice") {
		script {
			sh """
				echo Hi ${name}
			"""
		}
	}
}