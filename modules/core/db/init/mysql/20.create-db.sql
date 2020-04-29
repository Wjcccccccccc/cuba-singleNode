-- begin TBL_CALL_RECORDS
alter table tbl_call_records add constraint FK_TBL_CALL_RECORDS_ON_CALLEE foreign key (CALLEE) references tbl_callee(id)^
alter table tbl_call_records add constraint FK_TBL_CALL_RECORDS_ON_COMP foreign key (COMP_ID) references tbl_company(ID)^
alter table tbl_call_records add constraint FK_TBL_CALL_RECORDS_ON_FLOW foreign key (FLOW_ID) references tbl_flow(ID)^
create index IDX_TBL_CALL_RECORDS_ON_CALLEE on tbl_call_records (CALLEE)^
create index IDX_TBL_CALL_RECORDS_ON_COMP on tbl_call_records (COMP_ID)^
create index IDX_TBL_CALL_RECORDS_ON_FLOW on tbl_call_records (FLOW_ID)^
-- end TBL_CALL_RECORDS
-- begin MY_SESSION
alter table MY_SESSION add constraint FK_MY_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references MY_SPEAKER(ID)^
create index IDX_MY_SESSION_ON_SPEAKER on MY_SESSION (SPEAKER_ID)^
-- end MY_SESSION
-- begin MY_SPEAKER
create unique index IDX_MY_SPEAKER_UNIQ_EMAIL on MY_SPEAKER (EMAIL) ^
-- end MY_SPEAKER

-- begin TBL_BUZ_DETAIL
alter table tbl_buz_detail add constraint FK_TBL_BUZ_DETAIL_ON_FLOW foreign key (FLOW_ID) references tbl_flow(ID)^
create index IDX_TBL_BUZ_DETAIL_ON_FLOW on tbl_buz_detail (FLOW_ID)^
-- end TBL_BUZ_DETAIL
-- begin TBL_BUZ_SKETCH
alter table tbl_buz_sketch add constraint FK_TBL_BUZ_SKETCH_ON_COM foreign key (COM_ID) references tbl_company(ID)^
alter table tbl_buz_sketch add constraint FK_TBL_BUZ_SKETCH_ON_FLOW foreign key (FLOW_ID) references tbl_flow(ID)^
create index IDX_TBL_BUZ_SKETCH_ON_COM on tbl_buz_sketch (COM_ID)^
create index IDX_TBL_BUZ_SKETCH_ON_FLOW on tbl_buz_sketch (FLOW_ID)^
-- end TBL_BUZ_SKETCH
-- begin TBL_CALL_CONTENT
alter table tbl_call_content add constraint FK_TBL_CALL_CONTENT_ON_RECORD foreign key (RECORD_ID) references tbl_call_records(ID)^
alter table tbl_call_content add constraint FK_TBL_CALL_CONTENT_ON_FLOW foreign key (FLOW_ID) references tbl_flow(ID)^
create index IDX_TBL_CALL_CONTENT_ON_RECORD on tbl_call_content (RECORD_ID)^
create index IDX_TBL_CALL_CONTENT_ON_FLOW on tbl_call_content (FLOW_ID)^
-- end TBL_CALL_CONTENT
-- begin TBL_CALLEE
alter table tbl_callee add constraint FK_TBL_CALLEE_ON_COMP foreign key (COMP_ID) references tbl_company(ID)^
create index IDX_TBL_CALLEE_ON_COMP on tbl_callee (COMP_ID)^
-- end TBL_CALLEE
-- begin SEC_USER
alter table SEC_USER add constraint FK_SEC_USER_ON_COMP foreign key (COMP_ID) references tbl_company(ID)^
create index IDX_SEC_USER_ON_COMP on SEC_USER (COMP_ID)^
-- end SEC_USER
