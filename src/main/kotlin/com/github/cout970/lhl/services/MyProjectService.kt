package com.github.cout970.lhl.services

import com.intellij.openapi.project.Project
import com.github.cout970.lhl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
