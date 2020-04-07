package com.voiceai.cubarest.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.entity.Speaker;

@UiController("cubarest_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}