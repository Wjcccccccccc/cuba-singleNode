alter table SEC_USER add constraint FK_SEC_USER_ON_COMP foreign key (COMP_ID) references tbl_company(ID);
create index IDX_SEC_USER_ON_COMP on SEC_USER (COMP_ID);
