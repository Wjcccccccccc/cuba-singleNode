alter table MY_SESSION add constraint FK_MY_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references MY_SPEAKER(ID);
create index IDX_MY_SESSION_ON_SPEAKER on MY_SESSION (SPEAKER_ID);
