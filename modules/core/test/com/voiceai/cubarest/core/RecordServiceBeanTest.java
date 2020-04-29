package com.voiceai.cubarest.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.security.entity.User;
import com.voiceai.cubarest.CubarestTestContainer;
import com.voiceai.cubarest.entity.business.RecordStatictis;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecordServiceBeanTest {


    @RegisterExtension
    public static CubarestTestContainer cont = CubarestTestContainer.Common.INSTANCE;

    private static Metadata metadata;
    private static Persistence persistence;
    private static DataManager dataManager;

    @BeforeAll
    public static void beforeAll() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @AfterAll
    public static void afterAll() throws Exception {
    }


    @Test
    void recordStatistic() {
        System.out.println("Persistence >>>>>>>>>>>>>>>>");

        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<RecordStatictis> query = em.createQuery(
                    "SELECT NEW com.voiceai.cubarest.entity.business.RecordStatictis(c.gender,c.gender) FROM cubarest_TblCallRecords as c", RecordStatictis.class);
            query.getResultList().forEach(System.out::println);
            tx.commit();
        }

        System.out.println("DataManager >>>>>>>>>>>>>>>>");
        LoadContext<RecordStatictis> context = LoadContext.create(RecordStatictis.class)
                .setQuery(LoadContext.createQuery("SELECT NEW com.voiceai.cubarest.entity.business.RecordStatictis(c.gender,c.gender) FROM cubarest_TblCallRecords as c"));
        dataManager.loadList(context).forEach(System.out::println);

        System.out.println("End >>>>>>>>>>>>>>>>");
    }

}