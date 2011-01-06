select distinct mtData
from MemberTagData mtData, MemberTagCoord coord
where coord.memberTagId.application.name = 'FMTHotel'
and coord.memberTagId.memberTagName = 'Position_Desc'
and mtData.id = coord.memberTagData.id





