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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StudentEthnicity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class StudentEthnicity {
  public static final String SERIALIZED_NAME_INDIAN_ALASKA_NATIVE = "indianAlaskaNative";
  @SerializedName(SERIALIZED_NAME_INDIAN_ALASKA_NATIVE)
  private String indianAlaskaNative;

  public static final String SERIALIZED_NAME_ASIAN = "asian";
  @SerializedName(SERIALIZED_NAME_ASIAN)
  private String asian;

  public static final String SERIALIZED_NAME_HISPANIC = "hispanic";
  @SerializedName(SERIALIZED_NAME_HISPANIC)
  private String hispanic;

  public static final String SERIALIZED_NAME_BLACK = "black";
  @SerializedName(SERIALIZED_NAME_BLACK)
  private String black;

  public static final String SERIALIZED_NAME_WHITE = "white";
  @SerializedName(SERIALIZED_NAME_WHITE)
  private String white;

  public static final String SERIALIZED_NAME_HAWAIIAN_PACIFICLSLANDER = "hawaiianPacificlslander";
  @SerializedName(SERIALIZED_NAME_HAWAIIAN_PACIFICLSLANDER)
  private String hawaiianPacificlslander;

  public static final String SERIALIZED_NAME_TWO_OR_MORE_RACES = "twoOrMoreRaces";
  @SerializedName(SERIALIZED_NAME_TWO_OR_MORE_RACES)
  private String twoOrMoreRaces;

  public StudentEthnicity() { 
  }

  public StudentEthnicity indianAlaskaNative(String indianAlaskaNative) {
    
    this.indianAlaskaNative = indianAlaskaNative;
    return this;
  }

   /**
   * Get indianAlaskaNative
   * @return indianAlaskaNative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIndianAlaskaNative() {
    return indianAlaskaNative;
  }


  public void setIndianAlaskaNative(String indianAlaskaNative) {
    this.indianAlaskaNative = indianAlaskaNative;
  }


  public StudentEthnicity asian(String asian) {
    
    this.asian = asian;
    return this;
  }

   /**
   * Get asian
   * @return asian
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAsian() {
    return asian;
  }


  public void setAsian(String asian) {
    this.asian = asian;
  }


  public StudentEthnicity hispanic(String hispanic) {
    
    this.hispanic = hispanic;
    return this;
  }

   /**
   * Get hispanic
   * @return hispanic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHispanic() {
    return hispanic;
  }


  public void setHispanic(String hispanic) {
    this.hispanic = hispanic;
  }


  public StudentEthnicity black(String black) {
    
    this.black = black;
    return this;
  }

   /**
   * Get black
   * @return black
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlack() {
    return black;
  }


  public void setBlack(String black) {
    this.black = black;
  }


  public StudentEthnicity white(String white) {
    
    this.white = white;
    return this;
  }

   /**
   * Get white
   * @return white
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWhite() {
    return white;
  }


  public void setWhite(String white) {
    this.white = white;
  }


  public StudentEthnicity hawaiianPacificlslander(String hawaiianPacificlslander) {
    
    this.hawaiianPacificlslander = hawaiianPacificlslander;
    return this;
  }

   /**
   * Get hawaiianPacificlslander
   * @return hawaiianPacificlslander
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHawaiianPacificlslander() {
    return hawaiianPacificlslander;
  }


  public void setHawaiianPacificlslander(String hawaiianPacificlslander) {
    this.hawaiianPacificlslander = hawaiianPacificlslander;
  }


  public StudentEthnicity twoOrMoreRaces(String twoOrMoreRaces) {
    
    this.twoOrMoreRaces = twoOrMoreRaces;
    return this;
  }

   /**
   * Get twoOrMoreRaces
   * @return twoOrMoreRaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTwoOrMoreRaces() {
    return twoOrMoreRaces;
  }


  public void setTwoOrMoreRaces(String twoOrMoreRaces) {
    this.twoOrMoreRaces = twoOrMoreRaces;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentEthnicity studentEthnicity = (StudentEthnicity) o;
    return Objects.equals(this.indianAlaskaNative, studentEthnicity.indianAlaskaNative) &&
        Objects.equals(this.asian, studentEthnicity.asian) &&
        Objects.equals(this.hispanic, studentEthnicity.hispanic) &&
        Objects.equals(this.black, studentEthnicity.black) &&
        Objects.equals(this.white, studentEthnicity.white) &&
        Objects.equals(this.hawaiianPacificlslander, studentEthnicity.hawaiianPacificlslander) &&
        Objects.equals(this.twoOrMoreRaces, studentEthnicity.twoOrMoreRaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indianAlaskaNative, asian, hispanic, black, white, hawaiianPacificlslander, twoOrMoreRaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentEthnicity {\n");
    sb.append("    indianAlaskaNative: ").append(toIndentedString(indianAlaskaNative)).append("\n");
    sb.append("    asian: ").append(toIndentedString(asian)).append("\n");
    sb.append("    hispanic: ").append(toIndentedString(hispanic)).append("\n");
    sb.append("    black: ").append(toIndentedString(black)).append("\n");
    sb.append("    white: ").append(toIndentedString(white)).append("\n");
    sb.append("    hawaiianPacificlslander: ").append(toIndentedString(hawaiianPacificlslander)).append("\n");
    sb.append("    twoOrMoreRaces: ").append(toIndentedString(twoOrMoreRaces)).append("\n");
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

