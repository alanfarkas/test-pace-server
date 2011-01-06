package com.palladium.paf.state;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.mdb.PafDimMember;
import com.palladium.paf.mdb.PafDimTree;

public interface IPafEvalState {
    public String getPlanningVersionName();
    public MemberTreeSet getDataCacheTrees();
    public PafApplicationDef getAppDef();
	public PafClientState getClientState();
    public Map<String, Set<Intersection>> getChangedCellsByTime();
    public Map<String, Set<Intersection>> getChangedCellsByMsr();    
    public PafDimTree getTimeSubTree();
	public PafDimMember getCurrentTimeMember();
	public String getCurrentTimeSlice();
	public String getFirstTimeSlice();
	public String getPreviousTimeSlice();
	public Set<Intersection> getCurrentChangedCells();
	public Set<Intersection>getOrigLockedCells();
	public String getMsrDim();
	public String getMeasureName();
	public Set<Intersection> getCurrentLockedCells();
	public void addAllAllocations(Collection<Intersection> cellsToLock);
}
