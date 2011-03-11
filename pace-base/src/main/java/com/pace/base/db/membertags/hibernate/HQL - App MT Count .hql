select count(distinct coord.memberTagData) from MemberTagCoord coord
where  coord.memberTagId.application.name = 'FMTHotel'


