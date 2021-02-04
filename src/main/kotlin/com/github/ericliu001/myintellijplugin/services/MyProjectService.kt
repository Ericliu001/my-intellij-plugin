package com.github.ericliu001.myintellijplugin.services

import com.github.ericliu001.myintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
