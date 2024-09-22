package jobs;

public class Example1 {
	def run(String name = "Alice") {
		script {
			sh """
				echo Hi ${name}
			"""
		}
	}
}