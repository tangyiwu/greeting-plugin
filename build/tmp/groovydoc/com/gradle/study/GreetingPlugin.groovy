package com.gradle.study

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // 创建一个类型为GreetingExtension，名称为greeting的属性
        project.extensions.create("greeting", GreeingExtension)
        // 创建一个类型为SayHelloTask，名称为sayHello的任务
        project.task('sayHello', type:SayHelloTask)
    }
}
