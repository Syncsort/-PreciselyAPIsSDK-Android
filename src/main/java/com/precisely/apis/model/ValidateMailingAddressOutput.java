/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.ValidateMailingAddressInputRowUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ValidateMailingAddressOutput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class ValidateMailingAddressOutput   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("AddressLine1")
  private String addressLine1 = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("FirmName")
  private String firmName = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;

  @SerializedName("BlockAddress")
  private String blockAddress = null;

  @SerializedName("AdditionalInputData")
  private String additionalInputData = null;

  @SerializedName("PostalCode.Base")
  private String postalCodeBase = null;

  @SerializedName("PostalCode.AddOn")
  private String postalCodeAddOn = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Status.Code")
  private String statusCode = null;

  @SerializedName("Status.Description")
  private String statusDescription = null;

  public ValidateMailingAddressOutput userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @ApiModelProperty(example = "null", value = "These fields are returned, unmodified, in the user_fields section of the response.")
  public List<ValidateMailingAddressInputRowUserFields> getUserFields() {
    return userFields;
  }

  public void setUserFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
  }

  public ValidateMailingAddressOutput addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the validated address.
   * @return addressLine1
  **/
  @ApiModelProperty(example = "null", value = "The first line of the validated address.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ValidateMailingAddressOutput addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the validated address.
   * @return addressLine2
  **/
  @ApiModelProperty(example = "null", value = "The second line of the validated address.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ValidateMailingAddressOutput firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * The validated firm or company name.
   * @return firmName
  **/
  @ApiModelProperty(example = "null", value = "The validated firm or company name.")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public ValidateMailingAddressOutput city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The validated city name.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The validated city name.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidateMailingAddressOutput postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The validated ZIP Code or postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The validated ZIP Code or postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ValidateMailingAddressOutput country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country name in English.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "The country name in English.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ValidateMailingAddressOutput stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The validated state or province abbreviation.
   * @return stateProvince
  **/
  @ApiModelProperty(example = "null", value = "The validated state or province abbreviation.")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public ValidateMailingAddressOutput blockAddress(String blockAddress) {
    this.blockAddress = blockAddress;
    return this;
  }

   /**
   * The formatted address, as it would appear on a physical mail piece.
   * @return blockAddress
  **/
  @ApiModelProperty(example = "null", value = "The formatted address, as it would appear on a physical mail piece.")
  public String getBlockAddress() {
    return blockAddress;
  }

  public void setBlockAddress(String blockAddress) {
    this.blockAddress = blockAddress;
  }

  public ValidateMailingAddressOutput additionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
    return this;
  }

   /**
   * Input data not used by the address validation process.
   * @return additionalInputData
  **/
  @ApiModelProperty(example = "null", value = "Input data not used by the address validation process.")
  public String getAdditionalInputData() {
    return additionalInputData;
  }

  public void setAdditionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
  }

  public ValidateMailingAddressOutput postalCodeBase(String postalCodeBase) {
    this.postalCodeBase = postalCodeBase;
    return this;
  }

   /**
   * The 5-digit ZIP Code.
   * @return postalCodeBase
  **/
  @ApiModelProperty(example = "null", value = "The 5-digit ZIP Code.")
  public String getPostalCodeBase() {
    return postalCodeBase;
  }

  public void setPostalCodeBase(String postalCodeBase) {
    this.postalCodeBase = postalCodeBase;
  }

  public ValidateMailingAddressOutput postalCodeAddOn(String postalCodeAddOn) {
    this.postalCodeAddOn = postalCodeAddOn;
    return this;
  }

   /**
   * The 4-digit add-on part of the ZIP Code.
   * @return postalCodeAddOn
  **/
  @ApiModelProperty(example = "null", value = "The 4-digit add-on part of the ZIP Code.")
  public String getPostalCodeAddOn() {
    return postalCodeAddOn;
  }

  public void setPostalCodeAddOn(String postalCodeAddOn) {
    this.postalCodeAddOn = postalCodeAddOn;
  }

  public ValidateMailingAddressOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Reports the success or failure of the match attempt.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Reports the success or failure of the match attempt.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ValidateMailingAddressOutput statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Reason for failure, if there is one.
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "Reason for failure, if there is one.")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ValidateMailingAddressOutput statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Description of the problem, if there is one.
   * @return statusDescription
  **/
  @ApiModelProperty(example = "null", value = "Description of the problem, if there is one.")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressOutput validateMailingAddressOutput = (ValidateMailingAddressOutput) o;
    return Objects.equals(this.userFields, validateMailingAddressOutput.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressOutput.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressOutput.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressOutput.firmName) &&
        Objects.equals(this.city, validateMailingAddressOutput.city) &&
        Objects.equals(this.postalCode, validateMailingAddressOutput.postalCode) &&
        Objects.equals(this.country, validateMailingAddressOutput.country) &&
        Objects.equals(this.stateProvince, validateMailingAddressOutput.stateProvince) &&
        Objects.equals(this.blockAddress, validateMailingAddressOutput.blockAddress) &&
        Objects.equals(this.additionalInputData, validateMailingAddressOutput.additionalInputData) &&
        Objects.equals(this.postalCodeBase, validateMailingAddressOutput.postalCodeBase) &&
        Objects.equals(this.postalCodeAddOn, validateMailingAddressOutput.postalCodeAddOn) &&
        Objects.equals(this.status, validateMailingAddressOutput.status) &&
        Objects.equals(this.statusCode, validateMailingAddressOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateMailingAddressOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, city, postalCode, country, stateProvince, blockAddress, additionalInputData, postalCodeBase, postalCodeAddOn, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressOutput {\n");
    
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    blockAddress: ").append(toIndentedString(blockAddress)).append("\n");
    sb.append("    additionalInputData: ").append(toIndentedString(additionalInputData)).append("\n");
    sb.append("    postalCodeBase: ").append(toIndentedString(postalCodeBase)).append("\n");
    sb.append("    postalCodeAddOn: ").append(toIndentedString(postalCodeAddOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

