package com.voiceai.cubarest.web.screens.tblcallrecords;

import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.entity.TblCallRecords;

@UiController("cubarest_TblCallRecords.browse")
@UiDescriptor("tbl-call-records-browse.xml")
@LookupComponent("tblCallRecordsesTable")
@LoadDataBeforeShow
public class TblCallRecordsBrowse extends StandardLookup<TblCallRecords> {


}