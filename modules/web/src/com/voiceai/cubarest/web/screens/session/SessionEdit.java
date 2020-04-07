package com.voiceai.cubarest.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.entity.Session;

@UiController("cubarest_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}