package com.hwf.pluginv1;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @Author: hwf
 * @Date: 2023/6/20  17:16
 * @Version 1.0
 */
public class FirstAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "this is message content", "this message title", Messages.getInformationIcon());
    }
}
