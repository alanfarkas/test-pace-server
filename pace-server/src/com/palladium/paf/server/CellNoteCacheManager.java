/**
 * 
 */
package com.palladium.paf.server;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.pace.base.PafException;
import com.pace.base.app.UnitOfWork;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionType;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.state.PafClientState;

/**
 * @author fskrgic
 *
 */
public class CellNoteCacheManager {

	private ConcurrentHashMap<String, CellNoteCache> noteCache;
	
	private static CellNoteCacheManager _instance;
	
	/**
	 * 
	 */
	private CellNoteCacheManager() {
		
		noteCache = new ConcurrentHashMap<String, CellNoteCache>();
		
	}
	
	public CellNoteCache getNoteCache(String clientID){
		return noteCache.get(clientID);
	}
	
	public CellNoteCache createNoteCache(PafClientState clientState, UnitOfWork uow) throws PafException{
		
		String clientId = clientState.getClientId();
		String dataSourceId = clientState.getApp().getMdbDef().getDataSourceId();
		String appId = clientState.getApp().getAppId();
		PafPlannerConfig plannerConfig = clientState.getPlannerConfig();
		
		String [] dims = uow.getDimensions();
		
		HashMap<String, String[]> dimMembers = uow.getDimMembers();
		
		HashMap<String, Set<String>> dimMemberSets = new HashMap<String, Set<String>>();
		
		String versionDimName = PafAppService.getInstance().getApplications().get(0).getMdbDef().getVersionDim();
		
		for(String dim : dims){
			
			HashSet<String> set = new HashSet<String>();
			
			set.addAll(Arrays.asList(dimMembers.get(dim)));
			
			//if version dimension, add Variance and Contribution percent members
			if ( versionDimName != null && dim.equals(versionDimName)) {

				if (plannerConfig != null && plannerConfig.getVersionFilter() != null && plannerConfig.getVersionFilter().length > 0 ) {
					
					set.addAll(Arrays.asList(plannerConfig.getVersionFilter()));
					
				} else {
																				
					Set<String> additionalVersionCalcedMemberSet = new HashSet<String>();
					
					List<VersionDef> versionDefs = PafMetaData.getPaceProject().getVersions();
					
					for (VersionDef versionDef : versionDefs ) {
						
						if ( versionDef.getType().equals(VersionType.Variance) ) {
							
							String baseVersionName = versionDef.getVersionFormula().getBaseVersion();
							String compareVersionName = versionDef.getVersionFormula().getCompareVersion();
							
							if ( set.contains(baseVersionName) && set.contains(compareVersionName) ) {
								additionalVersionCalcedMemberSet.add(versionDef.getName());
							}
							
						} else if ( versionDef.getType().equals(VersionType.ContribPct ) ) {
							
							String baseVersionName = versionDef.getVersionFormula().getBaseVersion();
							
							if ( set.contains(baseVersionName) ) {
								additionalVersionCalcedMemberSet.add(versionDef.getName());
							}
						}
						
					}
					
					set.addAll(additionalVersionCalcedMemberSet);					
						
					
					
				}
												
			}
			
			dimMemberSets.put(dim, set);
			
		}
		
		//push in new cell note cache
		noteCache.put(clientId, new CellNoteCache(dimMemberSets, dataSourceId, appId));
		
		return noteCache.get(clientId);
	}
	
	public static CellNoteCacheManager getInstance(){
		if(_instance == null){
			_instance = new CellNoteCacheManager();
		}
		return _instance;
	}
			
}
