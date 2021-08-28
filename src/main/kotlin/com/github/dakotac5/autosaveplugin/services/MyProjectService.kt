package com.github.dakotac5.autosaveplugin.services

import com.github.dakotac5.autosaveplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
