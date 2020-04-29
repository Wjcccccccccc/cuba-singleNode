package com.voiceai.cubarest.web.screens.tblcallrecords;

import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.entity.TblCallRecords;

@UiController("cubarest_TblCallRecords.edit")
@UiDescriptor("tbl-call-records-edit.xml")
@EditedEntityContainer("tblCallRecordsDc")
@LoadDataBeforeShow
public class TblCallRecordsEdit extends StandardEditor<TblCallRecords> {
}