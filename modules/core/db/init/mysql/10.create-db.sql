-- begin MY_SESSION
create table MY_SESSION (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    START_TIME datetime(3) not null,
    END_TIME datetime(3),
    SPEAKER_ID varchar(32),
    --
    primary key (ID)
)^
-- end MY_SESSION
-- begin MY_SPEAKER
create table MY_SPEAKER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end MY_SPEAKER
-- begin SEC_USER
alter table SEC_USER add column ADDRESS varchar(255) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'cubarest_ExtUser' where DTYPE is null ^
-- end SEC_USER
