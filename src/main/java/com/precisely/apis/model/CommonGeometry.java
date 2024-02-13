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
import com.precisely.apis.model.RisksGeometryCRC;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CommonGeometry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class CommonGeometry {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CRS = "crs";
  @SerializedName(SERIALIZED_NAME_CRS)
  private RisksGeometryCRC crs;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private Object coordinates;

  public CommonGeometry() { 
  }

  public CommonGeometry type(String type) {
    
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


  public CommonGeometry crs(RisksGeometryCRC crs) {
    
    this.crs = crs;
    return this;
  }

   /**
   * Get crs
   * @return crs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RisksGeometryCRC getCrs() {
    return crs;
  }


  public void setCrs(RisksGeometryCRC crs) {
    this.crs = crs;
  }


  public CommonGeometry coordinates(Object coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(Object coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGeometry commonGeometry = (CommonGeometry) o;
    return Objects.equals(this.type, commonGeometry.type) &&
        Objects.equals(this.crs, commonGeometry.crs) &&
        Objects.equals(this.coordinates, commonGeometry.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, crs, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGeometry {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

