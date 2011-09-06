package com.pace.base.state;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.pace.base.app.PafApplicationDef;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;

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
	public boolean isAttributeEval();
	public PafDataCache getDataCache();
}
