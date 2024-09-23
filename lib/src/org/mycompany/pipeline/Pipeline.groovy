package org.mycompany.pipeline

class Pipeline {

    def stages = []

    void addStage(Stage stage) {
        stages.add(stage)
    }

    void execute() {
        stages.each { stage ->
            stage.execute()
        }
    }

}
