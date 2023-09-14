/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.MatchedAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ParcelV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class ParcelV2 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRECISELY_ID = "preciselyId";
  @SerializedName(SERIALIZED_NAME_PRECISELY_ID)
  private String preciselyId;

  public static final String SERIALIZED_NAME_PARENT_PRECISELY_ID = "parentPreciselyId";
  @SerializedName(SERIALIZED_NAME_PARENT_PRECISELY_ID)
  private String parentPreciselyId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private MatchedAddress address;

  public static final String SERIALIZED_NAME_TAX_APN = "taxApn";
  @SerializedName(SERIALIZED_NAME_TAX_APN)
  private String taxApn;

  public static final String SERIALIZED_NAME_TAX_ACCOUNT_NUMBER = "taxAccountNumber";
  @SerializedName(SERIALIZED_NAME_TAX_ACCOUNT_NUMBER)
  private String taxAccountNumber;

  public static final String SERIALIZED_NAME_PROP_LINK_ID = "propLinkId";
  @SerializedName(SERIALIZED_NAME_PROP_LINK_ID)
  private String propLinkId;

  public ParcelV2() { 
  }

  public ParcelV2 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ParcelV2 preciselyId(String preciselyId) {
    
    this.preciselyId = preciselyId;
    return this;
  }

   /**
   * Get preciselyId
   * @return preciselyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreciselyId() {
    return preciselyId;
  }


  public void setPreciselyId(String preciselyId) {
    this.preciselyId = preciselyId;
  }


  public ParcelV2 parentPreciselyId(String parentPreciselyId) {
    
    this.parentPreciselyId = parentPreciselyId;
    return this;
  }

   /**
   * Get parentPreciselyId
   * @return parentPreciselyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentPreciselyId() {
    return parentPreciselyId;
  }


  public void setParentPreciselyId(String parentPreciselyId) {
    this.parentPreciselyId = parentPreciselyId;
  }


  public ParcelV2 address(MatchedAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchedAddress getAddress() {
    return address;
  }


  public void setAddress(MatchedAddress address) {
    this.address = address;
  }


  public ParcelV2 taxApn(String taxApn) {
    
    this.taxApn = taxApn;
    return this;
  }

   /**
   * Get taxApn
   * @return taxApn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxApn() {
    return taxApn;
  }


  public void setTaxApn(String taxApn) {
    this.taxApn = taxApn;
  }


  public ParcelV2 taxAccountNumber(String taxAccountNumber) {
    
    this.taxAccountNumber = taxAccountNumber;
    return this;
  }

   /**
   * Get taxAccountNumber
   * @return taxAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxAccountNumber() {
    return taxAccountNumber;
  }


  public void setTaxAccountNumber(String taxAccountNumber) {
    this.taxAccountNumber = taxAccountNumber;
  }


  public ParcelV2 propLinkId(String propLinkId) {
    
    this.propLinkId = propLinkId;
    return this;
  }

   /**
   * Get propLinkId
   * @return propLinkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropLinkId() {
    return propLinkId;
  }


  public void setPropLinkId(String propLinkId) {
    this.propLinkId = propLinkId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelV2 parcelV2 = (ParcelV2) o;
    return Objects.equals(this.id, parcelV2.id) &&
        Objects.equals(this.preciselyId, parcelV2.preciselyId) &&
        Objects.equals(this.parentPreciselyId, parcelV2.parentPreciselyId) &&
        Objects.equals(this.address, parcelV2.address) &&
        Objects.equals(this.taxApn, parcelV2.taxApn) &&
        Objects.equals(this.taxAccountNumber, parcelV2.taxAccountNumber) &&
        Objects.equals(this.propLinkId, parcelV2.propLinkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, preciselyId, parentPreciselyId, address, taxApn, taxAccountNumber, propLinkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    preciselyId: ").append(toIndentedString(preciselyId)).append("\n");
    sb.append("    parentPreciselyId: ").append(toIndentedString(parentPreciselyId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxApn: ").append(toIndentedString(taxApn)).append("\n");
    sb.append("    taxAccountNumber: ").append(toIndentedString(taxAccountNumber)).append("\n");
    sb.append("    propLinkId: ").append(toIndentedString(propLinkId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

