from MemberTagData mtData where mtData.id in (
	select distinct coord.memberTagData.id
	from MemberTagCoord coord
	where coord.memberTagId.application.name = 'TitanCopy'
	and coord.memberTagId.memberTagName = 'Dept_Desc'
	)
