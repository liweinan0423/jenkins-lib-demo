package jobs;

public class Example1 {
	def script(String name = "Alice") {
		script {
			sh """
				echo Hi ${name}
			"""
		}
	}
}