   drop table "PAFSYS"."CELL_NOTE_MAPPINGS";

   drop table "PAFSYS"."CELL_NOTES";

   drop table "PAFSYS"."DATASOURCES";

   drop table "PAFSYS"."SECURITY_GROUPS";

   --drop table "PAFSYS"."MEMBER_TAG_COORDS";
   
   --drop table "PAFSYS"."MEMBER_TAG_DATA";
   
   --drop table "PAFSYS"."MEMBER_TAG_ID";
   
   drop table "PAFSYS"."DIMENSIONS";

   drop table "PAFSYS"."APPLICATIONS";

   --APPLICAITONS
   create table "PAFSYS"."APPLICATIONS"(
        "ID" INTEGER not null generated always as identity,
       "NAME" VARCHAR(255) not null unique,
        constraint "SQL070808052403710" primary key ("ID")
    );

    create unique index "SQL070808052403710" on "PAFSYS"."APPLICATIONS"("ID");
    create unique index "SQL070808052857560" on "PAFSYS"."APPLICATIONS"("NAME");

   --DIMENSIONS
   create table "PAFSYS"."DIMENSIONS"(
        "ID" INTEGER not null generated always as identity,
       "NAME" VARCHAR(255) not null unique,
       "ENABLED" CHAR(1) not null,
        constraint "SQL070808052754680" primary key ("ID")
    );

    create unique index "SQL070808052754680" on "PAFSYS"."DIMENSIONS"("ID");
    create unique index "SQL070808052855200" on "PAFSYS"."DIMENSIONS"("NAME");

   --DATASOUCES
    create table "PAFSYS"."DATASOURCES"(
        "ID" INTEGER not null generated always as identity,
       "NAME" VARCHAR(255) not null unique,
        constraint "SQL070808052411720" primary key ("ID")
    );

    create unique index "SQL070808052411720" on "PAFSYS"."DATASOURCES"("ID");
    create unique index "SQL070808052832030" on "PAFSYS"."DATASOURCES"("NAME");

   --CELL NOTES
    create table "PAFSYS"."CELL_NOTES"(
        "ID" INTEGER not null generated always as identity,
       "TEXT" VARCHAR(32672) not null,
       "CREATOR" VARCHAR(255) not null,
       "LAST_UPDATED" TIMESTAMP,
       "APPLICATION_ID" INTEGER not null,
       "DATA_SOURCE_ID" INTEGER not null,
       "VISIBLE" CHAR(1) not null,
        constraint "SQL070808052653970" primary key ("ID")
    );

    create unique index "SQL070808052653970" on "PAFSYS"."CELL_NOTES"("ID");

    --CELL NOTE MAPPING
    create table "PAFSYS"."CELL_NOTE_MAPPINGS"(
        "ID" INTEGER not null generated always as identity,
       "DIMENSION_ID" INTEGER not null,
       "MEMBER_NAME" VARCHAR(255) not null,
       "CELL_NOTE_ID" INTEGER not null,
        constraint "SQL070808052749700" primary key ("ID")
    );

    alter table "PAFSYS"."CELL_NOTE_MAPPINGS"  
        add constraint "CELL_NOTE_MAPPINGS_FK" 
        foreign key ("CELL_NOTE_ID") 
        references "PAFSYS"."CELL_NOTES"("ID");
    alter table "PAFSYS"."CELL_NOTE_MAPPINGS"  
        add constraint "CELL_NOTE_MAPPINGS_DIMS_FK" 
        foreign key ("DIMENSION_ID") 
        references "PAFSYS"."DIMENSIONS"("ID");
    create unique index "SQL070808052749700" on "PAFSYS"."CELL_NOTE_MAPPINGS"("ID");
    create index "SQL070808052811300" on "PAFSYS"."CELL_NOTE_MAPPINGS"("DIMENSION_ID");
    create index "SQL070808052814910" on "PAFSYS"."CELL_NOTE_MAPPINGS"("CELL_NOTE_ID");
   
   --SECURITY GROUPS
    create table "PAFSYS"."SECURITY_GROUPS"(

        "ID" INTEGER not null generated always as identity,

       "SECURITY_DOMAIN_NAME_TXT" VARCHAR(255) not null,

       "SECURITY_GROUP_NAME_TXT" VARCHAR(255) not null,

       "APPLICATION_ID" INTEGER not null,

        constraint "SECURITY_GROUPS_PK" primary key ("ID")

    );

    alter table "PAFSYS"."SECURITY_GROUPS"  

        add constraint "APPLICATION_ID_FK" 

        foreign key ("APPLICATION_ID") 

        references "PAFSYS"."APPLICATIONS"("ID");

    create unique index "SQL080124064530160" on "PAFSYS"."SECURITY_GROUPS"("ID");

    create index "SQL080124064530330" on "PAFSYS"."SECURITY_GROUPS"("APPLICATION_ID");
