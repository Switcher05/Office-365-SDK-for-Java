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
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Drive.
*/
public class Drive extends ODataBaseEntity {

    public Drive(){
        setODataType("#Microsoft.Graph.Drive");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
            
    private Identity owner;
     
    /**
    * Gets the owner.
    *
    * @return the Identity
    */
    public Identity getOwner() {
        return this.owner; 
    }

    /**
    * Sets the owner.
    *
    * @param value the Identity
    */
    public void setOwner(Identity value) { 
        this.owner = value; 
        valueChanged("owner", value);

    }
            
    private DriveQuota quota;
     
    /**
    * Gets the quota.
    *
    * @return the DriveQuota
    */
    public DriveQuota getQuota() {
        return this.quota; 
    }

    /**
    * Sets the quota.
    *
    * @param value the DriveQuota
    */
    public void setQuota(DriveQuota value) { 
        this.quota = value; 
        valueChanged("quota", value);

    }
}
