package com.voiceai.cubarest.core;

import com.voiceai.cubarest.entity.business.RecordStatictis;

import java.util.List;

public interface RecordService {
    String NAME = "cubarest_RecordService";

    List<RecordStatictis> recordStatistic();
}