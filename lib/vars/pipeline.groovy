def call() {
    def pipeline = new org.mycompany.pipeline.Pipeline()

    pipeline.addStage(new org.mycompany.pipeline.Stage('Build', {
        // Define build steps
        println 'Building...'
    }))

    pipeline.addStage(new org.mycompany.pipeline.Stage('Test', {
        // Define test steps
        println 'Testing...'
    }))

    pipeline.addStage(new org.mycompany.pipeline.Stage('Deploy', {
        // Define deploy steps
        println 'Deploying...'
    }))

    pipeline.execute()
	return 1
}
