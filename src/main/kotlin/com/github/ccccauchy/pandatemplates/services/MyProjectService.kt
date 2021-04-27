package com.github.ccccauchy.pandatemplates.services

import com.github.ccccauchy.pandatemplates.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
