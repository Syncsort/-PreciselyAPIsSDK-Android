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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * EmployeeCount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class EmployeeCount   {
  @SerializedName("inLocalBranch")
  private String inLocalBranch = null;

  @SerializedName("inOrganization")
  private String inOrganization = null;

  public EmployeeCount inLocalBranch(String inLocalBranch) {
    this.inLocalBranch = inLocalBranch;
    return this;
  }

   /**
   * Get inLocalBranch
   * @return inLocalBranch
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInLocalBranch() {
    return inLocalBranch;
  }

  public void setInLocalBranch(String inLocalBranch) {
    this.inLocalBranch = inLocalBranch;
  }

  public EmployeeCount inOrganization(String inOrganization) {
    this.inOrganization = inOrganization;
    return this;
  }

   /**
   * Get inOrganization
   * @return inOrganization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInOrganization() {
    return inOrganization;
  }

  public void setInOrganization(String inOrganization) {
    this.inOrganization = inOrganization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeCount employeeCount = (EmployeeCount) o;
    return Objects.equals(this.inLocalBranch, employeeCount.inLocalBranch) &&
        Objects.equals(this.inOrganization, employeeCount.inOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inLocalBranch, inOrganization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCount {\n");
    
    sb.append("    inLocalBranch: ").append(toIndentedString(inLocalBranch)).append("\n");
    sb.append("    inOrganization: ").append(toIndentedString(inOrganization)).append("\n");
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

