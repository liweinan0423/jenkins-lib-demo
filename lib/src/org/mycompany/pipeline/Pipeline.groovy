package org.mycompany.pipeline

class Pipeline {

    def stages = []

    void addStage(Stage stage) {
        stages.add(stage)
    }

    void execute() {
        stages.each { _stage ->
            stage {
                _stage.execute()
            }
        }
    }

}
