package com.voiceai.cubarest.web.screens.session;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.voiceai.cubarest.core.SessionService;
import com.voiceai.cubarest.entity.Session;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@UiController("cubarest_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {

    @Inject
    ScreenBuilders builders;

    @Inject
    SessionService sessionService;

    @Inject
    private Logger log;

    @Inject
    Notifications notifications;

    @Subscribe(id = "sessionsDl", target = Target.DATA_LOADER)
    public void onSessionsDlPostLoad(CollectionLoader.PostLoadEvent<Session> event) {

        List<Session> entities = event.getLoadedEntities();
        entities.forEach(entity -> {
            entity.setTopic("After fix:" + entity.getTopic());
            log.warn(entity.toString());
        });


    }

    @Subscribe(id = "sessionsDl", target = Target.DATA_LOADER)
    public void onSessionsDlPreLoad(CollectionLoader.PreLoadEvent<Session> event) {

    }

    @Subscribe("sessionCalendar")
    public void onSessionCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<Date> event) {
        Screen screen = builders.editor(Session.class, this)
                .editEntity((Session) event.getEntity())
                .withLaunchMode(OpenMode.DIALOG).build();

        screen.addAfterCloseListener(afterCloseEvent -> getScreenData().loadAll());

        screen.show();

    }

    @Subscribe("sessionCalendar")
    public void onSessionCalendarCalendarEventMove(Calendar.CalendarEventMoveEvent<Date> event) {

        Session entity = (Session) event.getEntity();
        Date newStart = event.getNewStart();

        Notifications.NotificationBuilder notify = notifications.create(Notifications.NotificationType.HUMANIZED)
                .withContentMode(ContentMode.TEXT);

        if (entity != null && !sessionService.rechedulerSession(entity, newStart)) {
            notify.withCaption("msg://CantMove");
        } else {
            notify.withCaption("msg://MoveSucc");
        }

        notify.show();
        getScreenData().loadAll();


    }
}