/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.precisely.apis.model.Geometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PoiCountRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class PoiCountRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_SIC_CODE = "sicCode";
  @SerializedName(SERIALIZED_NAME_SIC_CODE)
  private String sicCode;

  public static final String SERIALIZED_NAME_FUZZY_ON_NAME = "fuzzyOnName";
  @SerializedName(SERIALIZED_NAME_FUZZY_ON_NAME)
  private String fuzzyOnName;

  public static final String SERIALIZED_NAME_MATCH_MODE = "matchMode";
  @SerializedName(SERIALIZED_NAME_MATCH_MODE)
  private String matchMode;

  public static final String SERIALIZED_NAME_SPECIFIC_MATCH_ON = "specificMatchOn";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_MATCH_ON)
  private String specificMatchOn;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_GEOMETRY_AS_TEXT = "geometryAsText";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_AS_TEXT)
  private String geometryAsText;

  public PoiCountRequest() { 
  }

  public PoiCountRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PoiCountRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PoiCountRequest categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public PoiCountRequest sicCode(String sicCode) {
    
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Get sicCode
   * @return sicCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSicCode() {
    return sicCode;
  }


  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }


  public PoiCountRequest fuzzyOnName(String fuzzyOnName) {
    
    this.fuzzyOnName = fuzzyOnName;
    return this;
  }

   /**
   * Get fuzzyOnName
   * @return fuzzyOnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFuzzyOnName() {
    return fuzzyOnName;
  }


  public void setFuzzyOnName(String fuzzyOnName) {
    this.fuzzyOnName = fuzzyOnName;
  }


  public PoiCountRequest matchMode(String matchMode) {
    
    this.matchMode = matchMode;
    return this;
  }

   /**
   * Get matchMode
   * @return matchMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchMode() {
    return matchMode;
  }


  public void setMatchMode(String matchMode) {
    this.matchMode = matchMode;
  }


  public PoiCountRequest specificMatchOn(String specificMatchOn) {
    
    this.specificMatchOn = specificMatchOn;
    return this;
  }

   /**
   * Get specificMatchOn
   * @return specificMatchOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpecificMatchOn() {
    return specificMatchOn;
  }


  public void setSpecificMatchOn(String specificMatchOn) {
    this.specificMatchOn = specificMatchOn;
  }


  public PoiCountRequest geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public PoiCountRequest geometryAsText(String geometryAsText) {
    
    this.geometryAsText = geometryAsText;
    return this;
  }

   /**
   * Get geometryAsText
   * @return geometryAsText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeometryAsText() {
    return geometryAsText;
  }


  public void setGeometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiCountRequest poiCountRequest = (PoiCountRequest) o;
    return Objects.equals(this.name, poiCountRequest.name) &&
        Objects.equals(this.type, poiCountRequest.type) &&
        Objects.equals(this.categoryCode, poiCountRequest.categoryCode) &&
        Objects.equals(this.sicCode, poiCountRequest.sicCode) &&
        Objects.equals(this.fuzzyOnName, poiCountRequest.fuzzyOnName) &&
        Objects.equals(this.matchMode, poiCountRequest.matchMode) &&
        Objects.equals(this.specificMatchOn, poiCountRequest.specificMatchOn) &&
        Objects.equals(this.geometry, poiCountRequest.geometry) &&
        Objects.equals(this.geometryAsText, poiCountRequest.geometryAsText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, categoryCode, sicCode, fuzzyOnName, matchMode, specificMatchOn, geometry, geometryAsText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiCountRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    fuzzyOnName: ").append(toIndentedString(fuzzyOnName)).append("\n");
    sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
    sb.append("    specificMatchOn: ").append(toIndentedString(specificMatchOn)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    geometryAsText: ").append(toIndentedString(geometryAsText)).append("\n");
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

