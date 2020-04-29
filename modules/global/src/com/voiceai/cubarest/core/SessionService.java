package com.voiceai.cubarest.core;

import com.voiceai.cubarest.entity.business.ListComingSessions;
import com.voiceai.cubarest.entity.Session;

import java.util.Date;
import java.util.List;

public interface SessionService {
    String NAME = "cubarest_SessionService";

    boolean rechedulerSession(Session session, Date newDate);

    List<ListComingSessions> listComingSessions();

    List<ListComingSessions> listComingSessions2();
}