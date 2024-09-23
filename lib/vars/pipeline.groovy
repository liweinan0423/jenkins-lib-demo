def call() {
    def pipeline = new org.mycompany.pipeline.Pipeline()

    pipeline.addStage(new org.mycompany.pipeline.Stage('Build', {
        script {
            sh"""
            echo Hello
            """
        }
    }))

    pipeline.execute()
	return 1
}
