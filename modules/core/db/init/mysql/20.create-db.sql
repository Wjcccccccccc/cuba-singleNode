-- begin MY_SESSION
alter table MY_SESSION add constraint FK_MY_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references MY_SPEAKER(ID)^
create index IDX_MY_SESSION_ON_SPEAKER on MY_SESSION (SPEAKER_ID)^
-- end MY_SESSION
-- begin MY_SPEAKER
create unique index IDX_MY_SPEAKER_UNIQ_EMAIL on MY_SPEAKER (EMAIL) ^
-- end MY_SPEAKER
