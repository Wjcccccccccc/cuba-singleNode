package com.voiceai.cubarest.core;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.voiceai.cubarest.entity.business.RecordStatictis;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(RecordService.NAME)
public class RecordServiceBean implements RecordService {

    @Inject
    DataManager dataManager;

    @Inject
    private Logger log;

    @Override

    public List<RecordStatictis> recordStatistic() {
        LoadContext<RecordStatictis> context = LoadContext.create(RecordStatictis.class)
                .setQuery(LoadContext.createQuery("SELECT SUM(IF(gender=1,1,0)) AS 'male' , SUM(IF(gender=1,0,1)) AS 'female'\n" +
                        "FROM `cubarest_TblCallRecords`"));
        List<RecordStatictis> list = dataManager.loadList(context);

        System.out.println("共查询到数据: " + list.size());
        list.forEach(vo -> log.warn(vo.toString()));

        return list;


    }
}