package com.gradle.study

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SayHelloTask extends DefaultTask {
    //定义一个属性
    def author = ''

    @TaskAction
    void sayHello() {
        //从project中获取greeting属性
        if (project.greeting.showAuthorName) {
            println "Hello ${author} ${project.greeting.message}"
        } else {
            println "Hello ${project.greeting.message}"
        }
    }
}
