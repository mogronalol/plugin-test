package com.github.mogronalol.plugintest.services

import com.intellij.openapi.project.Project
import com.github.mogronalol.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
