package com.palladium.paf.funcs;

import java.util.Map;
import java.util.Set;

import com.palladium.paf.PafException;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.state.IPafEvalState;

public interface IPafFunction  {
    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException;
    public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException;

	public String getOpCode();
	public String getMeasureName();
	public String[] getParms();
	public Map<String, Set<String>> getMemberDependencyMap(IPafEvalState evalState) throws PafException;
    public void parseParameters(String functionString);
    public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState);
	public boolean isRecalcComponent(Intersection is, IPafEvalState evalState);
//    public IPafFunction createFunction(String functionString);
    
}
