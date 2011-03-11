select distinct mtData
from MemberTagData mtData, MemberTagCoord coord
where coord.memberTagId.application.name = 'TitanCopy'
and mtData.id = coord.memberTagData.id