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
 * Age
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class Age   {
  @SerializedName("range")
  private String range = null;

  @SerializedName("value")
  private Integer value = null;

  public Age range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public Age value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Age age = (Age) o;
    return Objects.equals(this.range, age.range) &&
        Objects.equals(this.value, age.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Age {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

