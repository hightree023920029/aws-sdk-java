/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayVpcAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the VPC attachment.
     * </p>
     */
    private TransitGatewayVpcAttachment transitGatewayVpcAttachment;

    /**
     * <p>
     * Information about the VPC attachment.
     * </p>
     * 
     * @param transitGatewayVpcAttachment
     *        Information about the VPC attachment.
     */

    public void setTransitGatewayVpcAttachment(TransitGatewayVpcAttachment transitGatewayVpcAttachment) {
        this.transitGatewayVpcAttachment = transitGatewayVpcAttachment;
    }

    /**
     * <p>
     * Information about the VPC attachment.
     * </p>
     * 
     * @return Information about the VPC attachment.
     */

    public TransitGatewayVpcAttachment getTransitGatewayVpcAttachment() {
        return this.transitGatewayVpcAttachment;
    }

    /**
     * <p>
     * Information about the VPC attachment.
     * </p>
     * 
     * @param transitGatewayVpcAttachment
     *        Information about the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayVpcAttachmentResult withTransitGatewayVpcAttachment(TransitGatewayVpcAttachment transitGatewayVpcAttachment) {
        setTransitGatewayVpcAttachment(transitGatewayVpcAttachment);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTransitGatewayVpcAttachment() != null)
            sb.append("TransitGatewayVpcAttachment: ").append(getTransitGatewayVpcAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayVpcAttachmentResult == false)
            return false;
        CreateTransitGatewayVpcAttachmentResult other = (CreateTransitGatewayVpcAttachmentResult) obj;
        if (other.getTransitGatewayVpcAttachment() == null ^ this.getTransitGatewayVpcAttachment() == null)
            return false;
        if (other.getTransitGatewayVpcAttachment() != null && other.getTransitGatewayVpcAttachment().equals(this.getTransitGatewayVpcAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayVpcAttachment() == null) ? 0 : getTransitGatewayVpcAttachment().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayVpcAttachmentResult clone() {
        try {
            return (CreateTransitGatewayVpcAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
