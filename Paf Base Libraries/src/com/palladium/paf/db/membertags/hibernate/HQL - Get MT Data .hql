from MemberTagData mtData where mtData.id in (
	select max(coord.memberTagData.id)
	from MemberTagCoord coord
	where coord.memberTagId = 3
	and (coord.dimension = 14 and coord.memberName = 'Pos3'
	or coord.dimension = 15 and coord.memberName = 'F04')
	group by coord.memberTagData.id
	having count(coord.memberTagData.id) = 2
	)





