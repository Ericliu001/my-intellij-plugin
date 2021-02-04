package com.github.ericliu001.myintellijplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class SimpleAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val project = event.project

        Messages.showMessageDialog(project, "Hello World!", "greeting!", Messages.getInformationIcon())
    }
}