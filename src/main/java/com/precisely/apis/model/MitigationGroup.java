/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MitigationGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class MitigationGroup {
  public static final String SERIALIZED_NAME_WATER_DIST = "waterDist";
  @SerializedName(SERIALIZED_NAME_WATER_DIST)
  private Integer waterDist;

  public static final String SERIALIZED_NAME_TOPO_POS = "topoPos";
  @SerializedName(SERIALIZED_NAME_TOPO_POS)
  private Integer topoPos;

  public static final String SERIALIZED_NAME_BURNABLE = "burnable";
  @SerializedName(SERIALIZED_NAME_BURNABLE)
  private Integer burnable;

  public static final String SERIALIZED_NAME_F_STN_DIST = "fStnDist";
  @SerializedName(SERIALIZED_NAME_F_STN_DIST)
  private Integer fStnDist;

  public MitigationGroup() { 
  }

  public MitigationGroup waterDist(Integer waterDist) {
    
    this.waterDist = waterDist;
    return this;
  }

   /**
   * Get waterDist
   * @return waterDist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaterDist() {
    return waterDist;
  }


  public void setWaterDist(Integer waterDist) {
    this.waterDist = waterDist;
  }


  public MitigationGroup topoPos(Integer topoPos) {
    
    this.topoPos = topoPos;
    return this;
  }

   /**
   * Get topoPos
   * @return topoPos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTopoPos() {
    return topoPos;
  }


  public void setTopoPos(Integer topoPos) {
    this.topoPos = topoPos;
  }


  public MitigationGroup burnable(Integer burnable) {
    
    this.burnable = burnable;
    return this;
  }

   /**
   * Get burnable
   * @return burnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBurnable() {
    return burnable;
  }


  public void setBurnable(Integer burnable) {
    this.burnable = burnable;
  }


  public MitigationGroup fStnDist(Integer fStnDist) {
    
    this.fStnDist = fStnDist;
    return this;
  }

   /**
   * Get fStnDist
   * @return fStnDist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getfStnDist() {
    return fStnDist;
  }


  public void setfStnDist(Integer fStnDist) {
    this.fStnDist = fStnDist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MitigationGroup mitigationGroup = (MitigationGroup) o;
    return Objects.equals(this.waterDist, mitigationGroup.waterDist) &&
        Objects.equals(this.topoPos, mitigationGroup.topoPos) &&
        Objects.equals(this.burnable, mitigationGroup.burnable) &&
        Objects.equals(this.fStnDist, mitigationGroup.fStnDist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waterDist, topoPos, burnable, fStnDist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MitigationGroup {\n");
    sb.append("    waterDist: ").append(toIndentedString(waterDist)).append("\n");
    sb.append("    topoPos: ").append(toIndentedString(topoPos)).append("\n");
    sb.append("    burnable: ").append(toIndentedString(burnable)).append("\n");
    sb.append("    fStnDist: ").append(toIndentedString(fStnDist)).append("\n");
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

