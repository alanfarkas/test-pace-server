

    select
        "MEMBER_TAG_DATA_ID_INT", 
        count("MEMBER_TAG_DATA_ID_INT")
     from
        "PAFSYS"."MEMBER_TAG_COORDS"
    where 
    	"MEMBER_TAG_ID_INT" = 1
    	and ("DIMENSION_ID_INT" = 6 and "MEMBER_NAME_TXT" = 'DIV05'
    		or "DIMENSION_ID_INT" = 12 and "MEMBER_NAME_TXT" = 'Store1')
    group by "MEMBER_TAG_DATA_ID_INT"
    having count(MEMBER_TAG_DATA_ID_INT) = 2
;
     

/*
select
  membertagc0_.MEMBER_TAG_DATA_ID_INT,
  count(membertagc0_.MEMBER_TAG_DATA_ID_INT) as col_1_0_ 
 from
  PAFSYS.MEMBER_TAG_COORDS membertagc0_ 
 where
  membertagc0_.MEMBER_TAG_ID_INT=1 
  and (
   membertagc0_.DIMENSION_ID_INT=6 
   and membertagc0_.MEMBER_NAME_TXT='DIV05' 
   or membertagc0_.DIMENSION_ID_INT=12 
   and membertagc0_.MEMBER_NAME_TXT='Store1'
  ) 
 group by
  membertagc0_.MEMBER_TAG_DATA_ID_INT 
 having
  count(membertagc0_.MEMBER_TAG_DATA_ID_INT)= 2;
 */ 

       

/* select coords.memberTagData.idInt, count(coords.memberTagData.idInt)
from MemberTagCoords coords
where coords.memberTagId = 1
and (coords.dimension = 6 and coords.memberNameTxt = 'DIV05'
or coords.dimension = 12 and coords.memberNameTxt = 'Store1')
group by coords.memberTagData.idInt
having sum(coords.memberTagData.idInt) > 0
*/