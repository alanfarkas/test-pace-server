select coord.memberTagId.application.name, coord.memberTagId.memberTagName, count(distinct coord.memberTagData) 
from MemberTagCoord coord
where coord.memberTagId.application.name = 'FMTHotel'
group by coord.memberTagId.application.name, coord.memberTagId.memberTagName


