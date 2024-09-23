package org.mycompany.pipeline

class Job {

    String name

    Job(String name) {
        this.name = name
    }

    void run() {
        println "Running job: ${name}"
    // Job logic goes here
    }

}
