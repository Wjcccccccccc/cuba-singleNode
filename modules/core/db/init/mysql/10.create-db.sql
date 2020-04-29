-- begin TBL_ERR_LOG
create table tbl_err_log (
    call_id varchar(255),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    err_str varchar(255),
    --
    primary key (call_id)
)^
-- end TBL_ERR_LOG
-- begin TBL_COMPANY
create table tbl_company (
    ID integer,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    name varchar(255),
    --
    primary key (ID)
)^
-- end TBL_COMPANY
-- begin TBL_CALL_CONTENT
create table tbl_call_content (
    ID integer,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    answer varchar(255),
    speaker_type varchar(10),
    call_id varchar(255),
    record_id integer,
    flow_id integer,
    serial_number integer,
    --
    primary key (ID)
)^
-- end TBL_CALL_CONTENT
-- begin TBL_BUZ_SKETCH
create table tbl_buz_sketch (
    ID integer,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    com_id integer,
    flow_id integer,
    name varchar(255),
    remark varchar(255),
    --
    primary key (ID)
)^
-- end TBL_BUZ_SKETCH
-- begin TBL_CALLEE
create table tbl_callee (
    id varchar(255),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    city varchar(255),
    client_name varchar(255),
    comp_id integer,
    filepath varchar(255) not null,
    gender integer,
    name varchar(255),
    phone_num varchar(255),
    province varchar(255),
    --
    primary key (id)
)^
-- end TBL_CALLEE
-- begin TBL_BUZ_DETAIL
create table tbl_buz_detail (
    ID integer,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    content varchar(255),
    display_ng varchar(255),
    display_ok varchar(255),
    flow_id integer,
    keyword_ng varchar(255),
    keyword_ok varchar(255),
    required_question integer,
    serial_number integer,
    talk_type integer,
    --
    primary key (ID)
)^
-- end TBL_BUZ_DETAIL
-- begin TBL_CALL_RECORDS
create table tbl_call_records (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    answer_time datetime(3),
    call_id varchar(255),
    call_direct varchar(255),
    call_log longtext,
    call_result boolean,
    pass_hubei boolean,
    callee varchar(255),
    callee_area varchar(255),
    caller varchar(255),
    caller_area varchar(255),
    city varchar(255),
    comp_id integer,
    company varchar(255),
    content varchar(255),
    cough integer,
    health integer,
    duration_time integer,
    emotion integer,
    end_time datetime(3),
    filepath varchar(255),
    flow_id integer,
    flow_name varchar(255),
    gender integer,
    identity_check boolean,
    province varchar(255),
    robot_answer_time datetime(3),
    start_time datetime(3),
    --
    primary key (ID)
)^
-- end TBL_CALL_RECORDS
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
alter table SEC_USER add column LOGIN varchar(20) ^
update SEC_USER set LOGIN = '' where LOGIN is null ^
alter table SEC_USER modify column LOGIN varchar(20) not null ^
alter table SEC_USER add column PASSWORD varchar(20) ^
update SEC_USER set PASSWORD = '' where PASSWORD is null ^
alter table SEC_USER modify column PASSWORD varchar(20) not null ^
alter table SEC_USER add column PHONE varchar(255) ^
alter table SEC_USER add column COMP_ID integer ^
alter table SEC_USER add column REMARK varchar(255) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'cubarest_ExtUser' where DTYPE is null ^
-- end SEC_USER

-- begin TBL_FLOW
create table tbl_flow (
    ID int auto_increment,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    name varchar(255),
    --
    primary key (ID)
)^
-- end TBL_FLOW
