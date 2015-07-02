/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.services.outlook.fetchers;

import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import com.microsoft.services.orc.serialization.*;

import static com.microsoft.services.orc.core.Helpers.*;

/**
 * The type EventOperations.
 */
public class EventOperations extends ItemOperations {

     /**
      * Instantiates a new EventOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public EventOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public EventOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public EventOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }



    /**
     * Accept listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<Integer> accept(String comment) {
        JsonSerializer serializer = getResolver().getJsonSerializer();
        String serializedComment = serializer.serialize(comment);


        ListenableFuture<String> future = acceptRaw(serializedComment);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());

    }

     /**
     * AcceptRaw listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<String> acceptRaw(String comment){

        java.util.Map<String, String> map = new java.util.HashMap<String, String>();

        map.put("Comment", comment);

        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);

        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        request.getUrl().appendPathComponent("Microsoft.OutlookServices.Accept");

        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }




    /**
     * Decline listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<Integer> decline(String comment) {
        JsonSerializer serializer = getResolver().getJsonSerializer();
        String serializedComment = serializer.serialize(comment);


        ListenableFuture<String> future = declineRaw(serializedComment);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());

    }

     /**
     * DeclineRaw listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<String> declineRaw(String comment){

        java.util.Map<String, String> map = new java.util.HashMap<String, String>();

        map.put("Comment", comment);

        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);

        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        request.getUrl().appendPathComponent("Microsoft.OutlookServices.Decline");

        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }




    /**
     * TentativelyAccept listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<Integer> tentativelyAccept(String comment) {
        JsonSerializer serializer = getResolver().getJsonSerializer();
        String serializedComment = serializer.serialize(comment);


        ListenableFuture<String> future = tentativelyAcceptRaw(serializedComment);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());

    }

     /**
     * TentativelyAcceptRaw listenable future.
     * @param comment the comment
     * @return the listenable future
     */
    public ListenableFuture<String> tentativelyAcceptRaw(String comment){

        java.util.Map<String, String> map = new java.util.HashMap<String, String>();

        map.put("Comment", comment);

        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);

        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        request.getUrl().appendPathComponent("Microsoft.OutlookServices.TentativelyAccept");

        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}