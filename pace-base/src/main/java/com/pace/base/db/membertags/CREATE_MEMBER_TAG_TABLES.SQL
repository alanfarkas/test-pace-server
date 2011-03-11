	
-- Drop Tables	
	drop table  PAFSYS.MEMBER_TAG_COORDS;
	drop table  PAFSYS.MEMBER_TAG_DATA;
	drop table  PAFSYS.MEMBER_TAG_ID;

-- Member Tag ID Table
	create table "PAFSYS"."MEMBER_TAG_ID"(
     	"ID_INT" INTEGER not null generated always as identity,
      	"APP_ID_INT" INTEGER not null,
      	"MEMBER_TAG_NAME_TXT" VARCHAR(80) not null,
        primary key ("ID_INT"),
        unique ("APP_ID_INT", "MEMBER_TAG_NAME_TXT")
    );

--  	create index "APP_ID_INDEX" on "PAFSYS"."MEMBER_TAG_ID"("APP_ID_INT");  
--   	create index "MEMBER_TAG_INDEX" on "PAFSYS"."MEMBER_TAG_ID"("APP_ID_INT", "MEMBER_TAG_NAME_TXT"); 


-- Member Tag Coords Table
   create table "PAFSYS"."MEMBER_TAG_COORDS"(
       "ID_INT" INTEGER not null generated always as identity,
       "MEMBER_TAG_ID_INT" INTEGER not null,
       "DIMENSION_ID_INT" INTEGER not null,
       "MEMBER_NAME_TXT" VARCHAR(255) not null,
       "MEMBER_TAG_DATA_ID_INT" INTEGER not null,
        primary key ("ID_INT"),
        unique ("DIMENSION_ID_INT", "MEMBER_TAG_DATA_ID_INT")
    );


-- Member Tag Data Table
    create table "PAFSYS"."MEMBER_TAG_DATA"(
      	"ID_INT" INTEGER not null generated always as identity,
       	"MEMBER_TAG_VALUE_TXT" VARCHAR(1024) not null,
      	"MEMBER_TAG_TYPE_CHAR" CHAR(2) not null,
       	"CREATOR_TXT" VARCHAR(255) not null,
       	"LAST_UPDATED_DT" TIMESTAMP not null,
        primary key ("ID_INT")
    );


-- Table Constraints
   	alter table "PAFSYS"."MEMBER_TAG_ID"  
        add constraint "MEMBER_TAG_ID_APP_ID_FK" 
        foreign key ("APP_ID_INT") 
        references "PAFSYS"."APPLICATIONS"("ID");
        
 	alter table "PAFSYS"."MEMBER_TAG_COORDS"  
        add constraint "MEMBER_TAG_COORDS_MT_ID_FK" 
        foreign key ("MEMBER_TAG_ID_INT") 
        references "PAFSYS"."MEMBER_TAG_ID"("ID_INT");

  	alter table "PAFSYS"."MEMBER_TAG_COORDS"  
        add constraint "MEMBER_TAG_COORDS_DIM_ID_FK" 
        foreign key ("DIMENSION_ID_INT") 
        references "PAFSYS"."DIMENSIONS"("ID");

	alter table "PAFSYS"."MEMBER_TAG_COORDS"  
        add constraint "MEMBER_TAG_COORDS_MT_DATA_ID_FK" 
        foreign key ("MEMBER_TAG_DATA_ID_INT") 
        references "PAFSYS"."MEMBER_TAG_DATA"("ID_INT");


     