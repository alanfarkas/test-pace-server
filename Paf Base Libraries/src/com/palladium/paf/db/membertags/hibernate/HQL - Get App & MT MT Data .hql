select distinct mtData
from MemberTagData mtData, MemberTagCoord coord
where coord.memberTagId.application.name = 'Titan'
and mtData.id = coord.memberTagData.id