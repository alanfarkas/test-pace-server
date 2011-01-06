select coord.memberTagId.application.name, count(distinct coord.memberTagData) 
from MemberTagCoord coord
group by coord.memberTagId.application.name




