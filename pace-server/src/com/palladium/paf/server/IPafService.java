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
package com.palladium.paf.server;

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
import com.palladium.paf.server.comm.PafAuthRequest;
import com.palladium.paf.server.comm.PafAuthResponse;
import com.palladium.paf.server.comm.PafCellNoteInformationResponse;
import com.palladium.paf.server.comm.PafClearImportedAttrRequest;
import com.palladium.paf.server.comm.PafClearImportedAttrResponse;
import com.palladium.paf.server.comm.PafClientCacheBlock;
import com.palladium.paf.server.comm.PafClientCacheRequest;
import com.palladium.paf.server.comm.PafClientChangePasswordRequest;
import com.palladium.paf.server.comm.PafClientSecurityPasswordResetResponse;
import com.palladium.paf.server.comm.PafClientSecurityRequest;
import com.palladium.paf.server.comm.PafClientSecurityResponse;
import com.palladium.paf.server.comm.PafCommandResponse;
import com.palladium.paf.server.comm.PafCustomCommandRequest;
import com.palladium.paf.server.comm.PafCustomCommandResponse;
import com.palladium.paf.server.comm.PafFilteredMbrTagRequest;
import com.palladium.paf.server.comm.PafGetFilteredUOWSizeRequest;
import com.palladium.paf.server.comm.PafGetFilteredUOWSizeResponse;
import com.palladium.paf.server.comm.PafGetMemberTagDataResponse;
import com.palladium.paf.server.comm.PafGetMemberTagDefsRequest;
import com.palladium.paf.server.comm.PafGetMemberTagDefsResponse;
import com.palladium.paf.server.comm.PafGetMemberTagInfoResponse;
import com.palladium.paf.server.comm.PafGetNotesRequest;
import com.palladium.paf.server.comm.PafGetNotesResponse;
import com.palladium.paf.server.comm.PafGetPaceGroupsRequest;
import com.palladium.paf.server.comm.PafGetPaceGroupsResponse;
import com.palladium.paf.server.comm.PafGroupSecurityRequest;
import com.palladium.paf.server.comm.PafGroupSecurityResponse;
import com.palladium.paf.server.comm.PafImportAttrRequest;
import com.palladium.paf.server.comm.PafImportAttrResponse;
import com.palladium.paf.server.comm.PafImportMemberTagRequest;
import com.palladium.paf.server.comm.PafMdbPropsRequest;
import com.palladium.paf.server.comm.PafMdbPropsResponse;
import com.palladium.paf.server.comm.PafPlanSessionRequest;
import com.palladium.paf.server.comm.PafPlanSessionResponse;
import com.palladium.paf.server.comm.PafPopulateRoleFilterResponse;
import com.palladium.paf.server.comm.PafSaveMbrTagRequest;
import com.palladium.paf.server.comm.PafSaveNotesRequest;
import com.palladium.paf.server.comm.PafSaveNotesResponse;
import com.palladium.paf.server.comm.PafServerAck;
import com.palladium.paf.server.comm.PafSetPaceGroupsRequest;
import com.palladium.paf.server.comm.PafSetPaceGroupsResponse;
import com.palladium.paf.server.comm.PafSimpleCellNoteExportRequest;
import com.palladium.paf.server.comm.PafSimpleCellNoteExportResponse;
import com.palladium.paf.server.comm.PafSimpleCellNoteImportRequest;
import com.palladium.paf.server.comm.PafSimpleCellNoteImportResponse;
import com.palladium.paf.server.comm.PafSuccessResponse;
import com.palladium.paf.server.comm.PafTreeRequest;
import com.palladium.paf.server.comm.PafTreeResponse;
import com.palladium.paf.server.comm.PafTreesRequest;
import com.palladium.paf.server.comm.PafTreesResponse;
import com.palladium.paf.server.comm.PafUpdateDatacacheRequest;
import com.palladium.paf.server.comm.PafUserNamesforSecurityGroupsRequest;
import com.palladium.paf.server.comm.PafUserNamesforSecurityGroupsResponse;
import com.palladium.paf.server.comm.PafValidAttrRequest;
import com.palladium.paf.server.comm.PafValidAttrResponse;
import com.palladium.paf.server.comm.PafVerifyUsersRequest;
import com.palladium.paf.server.comm.PafVerifyUsersResponse;
import com.palladium.paf.server.comm.PafViewRequest;
import com.palladium.paf.server.comm.SaveWorkRequest;
import com.palladium.paf.server.comm.ViewRequest;
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