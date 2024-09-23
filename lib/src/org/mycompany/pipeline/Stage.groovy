package org.mycompany.pipeline

class Stage {

    String name
    Closure body

    Stage(String name, Closure body) {
        this.name = name
        this.body = body
    }

    void execute() {
        println "Executing stage: ${name}"
        body.call()
    }

}
