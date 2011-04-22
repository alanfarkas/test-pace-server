/*
 *  File: @(#)IPafService.java   Package: com.pace.base.server  Project: PafServer
 *  Created: Jun 26, 2005       By: JWatkins
 *  Version: x.xx
 *
 *  Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Palladium Group, Inc.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Palladium Group, Inc.
 *
 *
 *
    Date            Author          Version         Changes
    xx/xx/xx        xxxxxxxx        x.xx            ..............
 * 
 */
package com.pace.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;

import com.pace.base.PafNotAbletoGetLDAPContext;
import com.pace.base.PafNotAuthenticatedSoapException;
import com.pace.base.PafNotAuthorizedSoapException;
import com.pace.base.PafSoapException;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.comm.EvaluateViewRequest;
import com.pace.base.comm.PafRequest;
import com.pace.base.comm.PafResponse;
import com.pace.base.data.PafDataSlice;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewSection;
import com.pace.server.comm.*;
/**
 * The interface defnition for the PafServer Web Service
 *
 * @author Jim Watkins
 * @version x.xx
 *
 */

@WebService(name="PafService", targetNamespace="pace.palladium.com")


public interface IPafService extends Remote {
	public String getVersion() throws RemoteException;
	
    public PafPlanSessionResponse startPlanSession(PafPlanSessionRequest planRequest)  throws RemoteException, PafSoapException; 
	public PafView getView(ViewRequest viewRequest) throws RemoteException, PafSoapException;
	public PafResponse refreshMetaDataCache() throws RemoteException;
    public PafServerAck clientInit(ClientInitRequest pcInit) throws RemoteException, PafSoapException;
    public PafAuthResponse clientAuth(PafAuthRequest authReq) throws RemoteException, PafSoapException;
    public PafClientCacheBlock clientCacheRequest(PafClientCacheRequest cacheRequest) throws RemoteException, PafSoapException;
    public PafView evaluateView(EvaluateViewRequest evalRequest) throws RemoteException, PafSoapException;
    public PafDataSlice reloadDatacache(PafViewRequest reloadRequest) throws RemoteException, PafSoapException;    
	public PafDataSlice updateDatacache(PafUpdateDatacacheRequest updateRequest) throws RemoteException, PafSoapException;
    public PafCommandResponse saveWork(SaveWorkRequest saveWorkRequest) throws RemoteException, PafSoapException;
	public PafValidAttrResponse getValidAttributeMembers(PafValidAttrRequest attrRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafSoapException, PafNotAuthorizedSoapException;
    public PafMdbPropsResponse getMdbProps(PafMdbPropsRequest mdbPropsRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException;;
    public PafImportAttrResponse importMdbAttributeDims(PafImportAttrRequest importAttrRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException;
    public PafClearImportedAttrResponse clearImportedMdbAttributeDims(PafClearImportedAttrRequest clearImportedAttrRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException;
    public PafCustomCommandResponse runCustomCommand(PafCustomCommandRequest cmdRequest) throws RemoteException, PafSoapException;
    public PafResponse endPlanningSession(PafRequest endSessionRequest) throws RemoteException, PafSoapException;
    public PafTreeResponse getDimensionTree(PafTreeRequest pafTreeRequest) throws RemoteException, PafSoapException;
    public PafTreesResponse getDimensionTrees(PafTreesRequest pafTreesRequest) throws RemoteException, PafSoapException;
    public PafClientSecurityResponse getPafUser(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafNotAbletoGetLDAPContext;
    public PafClientSecurityResponse getPafUsers(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
    public PafClientSecurityResponse getPafUserNames(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;    
    public PafClientSecurityResponse createPafUser(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
    public PafClientSecurityResponse updatePafUser(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException;
    public PafClientSecurityResponse deletePafUser(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException;
    public PafClientSecurityPasswordResetResponse resetPafUserPassword(PafClientSecurityRequest clientSecurityRequest) throws RemoteException, PafSoapException;
    public PafClientSecurityResponse changePafUserPassword(PafClientChangePasswordRequest passwordResetRequest) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
    public PafPopulateRoleFilterResponse populateRoleFilters(PafPlanSessionRequest planSessionRequest) throws RemoteException, PafSoapException;
    public PafGetFilteredUOWSizeResponse getFilteredUOWSize(PafGetFilteredUOWSizeRequest filteredUOWSize) throws RemoteException, PafSoapException;
	public PafResponse reinitializeClientState(PafRequest cmdRequest) throws RemoteException, PafSoapException;
	public PafResponse logoff(PafRequest logoffRequest) throws RemoteException, PafSoapException;
	public PafGetNotesResponse getCellNotes(PafGetNotesRequest getNotesRequest) throws RemoteException,	PafSoapException;
	public PafSaveNotesResponse saveCellNotes(PafSaveNotesRequest getNotesRequest) throws RemoteException, PafSoapException;
	public PafCellNoteInformationResponse getCellNotesInformation(PafRequest pafRequest) throws RemoteException, PafSoapException;
	public PafSimpleCellNoteExportResponse getSimpleCellNotesToExport(PafSimpleCellNoteExportRequest pafSimpleCellNoteExportRequest) throws RemoteException, PafSoapException;
	public PafSimpleCellNoteImportResponse importSimpleCellNotes(PafSimpleCellNoteImportRequest pafSimpleCellNoteImportRequest) throws RemoteException, PafSoapException;
	public PafSuccessResponse clearMemberTagData(PafFilteredMbrTagRequest filteredMbrTagsRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafGetMemberTagDataResponse exportMemberTagData(PafFilteredMbrTagRequest filteredMbrTagsRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafGetMemberTagDefsResponse getMemberTagDefs(PafGetMemberTagDefsRequest memberTagDefsRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafGetMemberTagInfoResponse getMemberTagInfo(PafFilteredMbrTagRequest filteredMbrTagsRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafSuccessResponse importMemberTagData(PafImportMemberTagRequest importMemberTagRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafSuccessResponse renameMemberTagData(PafFilteredMbrTagRequest filteredMbrTagsRequest) throws RemoteException, PafSoapException;
	public PafSuccessResponse saveMemberTagData(PafSaveMbrTagRequest saveMbrTagsRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafUserNamesforSecurityGroupsResponse getUserNamesForSecurityGroups(PafUserNamesforSecurityGroupsRequest groupSecurityRequest)throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException, PafNotAbletoGetLDAPContext;
	public PafGroupSecurityResponse getPafGroups(PafGroupSecurityRequest groupSecurityRequest ) throws RemoteException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafSoapException, PafNotAbletoGetLDAPContext;
	public PafSetPaceGroupsResponse setGroups(PafSetPaceGroupsRequest paceGroupRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafGetPaceGroupsResponse getGroups(PafGetPaceGroupsRequest paceGroupRequest) throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException;
	public PafVerifyUsersResponse verifyUsers(PafVerifyUsersRequest req)throws RemoteException, PafSoapException, PafNotAuthenticatedSoapException, PafNotAuthorizedSoapException, PafNotAbletoGetLDAPContext;
	public PafSuccessResponse closeClientSession(PafRequest pafRequest) throws RemoteException;
	public PafSuccessResponse isSessionActive(PafRequest pafRequest) throws RemoteException;
}