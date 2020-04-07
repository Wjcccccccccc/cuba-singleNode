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
);