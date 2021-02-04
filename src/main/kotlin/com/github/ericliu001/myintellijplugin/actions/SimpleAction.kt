package com.github.ericliu001.myintellijplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.Messages
import com.intellij.util.Consumer

class SimpleAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {

        val fileChooserDescriptor = FileChooserDescriptor(true, true, false, false, false, false)

        fileChooserDescriptor.title = "Pick a file or a directory:"
        fileChooserDescriptor.description = "We do this for fun."

        FileChooser.chooseFile(fileChooserDescriptor, event.project, null, Consumer {

            Messages.showMessageDialog(event.project, "You have chosen: ${it.path}", "Congratulations!", Messages.getInformationIcon())
        })

    }
}