package com.voiceai.cubarest.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.entity.Speaker;

@UiController("cubarest_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}