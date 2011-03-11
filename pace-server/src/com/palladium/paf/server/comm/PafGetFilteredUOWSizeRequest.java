package com.palladium.paf.server.comm;

import com.pace.base.app.PafDimSpec;
import com.pace.base.comm.PafRequest;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author PMack
 *
 */
public class PafGetFilteredUOWSizeRequest extends PafRequest{
    private String selectedRole = null;
    private String seasonId = null;
    private boolean isInvalidIntersectionSuppressionSelected = false;
    private PafDimSpec[] pafUserSelections = null;
    
	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}
    /**
     * @return Returns the selectedRole.
     */
	public String getSelectedRole() {
		return selectedRole;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
    /**
     * @return Returns the selectedSeasonID.
     */
	public String getSeasonId() {
		return seasonId;
	}
	public void setIsInvalidIntersectionSuppressionSelected(boolean isInvalidIntersectionSuppressionSelected) {
		this.isInvalidIntersectionSuppressionSelected = isInvalidIntersectionSuppressionSelected;
	}
    /**
     * @return Returns whether or not Invalid Intersection Suppression is selected.
     */
	public boolean getIsInvalidIntersectionSuppressionSelected() {
		return isInvalidIntersectionSuppressionSelected;
	}
	public void setPafUserSelections(PafDimSpec[] userSelections) {
		this.pafUserSelections = userSelections;
	}
    /**
     * @return Returns an array of member selection made by the user
     */
	public PafDimSpec[] getPafUserSelections() {
		return pafUserSelections;
	}
    
    
}
