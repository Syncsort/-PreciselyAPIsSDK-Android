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
import com.precisely.apis.model.ValidateMailingAddressPremiumInputRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidateMailingAddressPremiumInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class ValidateMailingAddressPremiumInput {
  public static final String SERIALIZED_NAME_ROW = "Row";
  @SerializedName(SERIALIZED_NAME_ROW)
  private List<ValidateMailingAddressPremiumInputRow> row = null;

  public ValidateMailingAddressPremiumInput() { 
  }

  public ValidateMailingAddressPremiumInput row(List<ValidateMailingAddressPremiumInputRow> row) {
    
    this.row = row;
    return this;
  }

  public ValidateMailingAddressPremiumInput addRowItem(ValidateMailingAddressPremiumInputRow rowItem) {
    if (this.row == null) {
      this.row = new ArrayList<ValidateMailingAddressPremiumInputRow>();
    }
    this.row.add(rowItem);
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ValidateMailingAddressPremiumInputRow> getRow() {
    return row;
  }


  public void setRow(List<ValidateMailingAddressPremiumInputRow> row) {
    this.row = row;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressPremiumInput validateMailingAddressPremiumInput = (ValidateMailingAddressPremiumInput) o;
    return Objects.equals(this.row, validateMailingAddressPremiumInput.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressPremiumInput {\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

