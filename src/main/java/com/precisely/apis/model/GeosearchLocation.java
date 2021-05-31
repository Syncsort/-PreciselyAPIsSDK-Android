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
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.TypeaheadRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * GeosearchLocation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-07T00:19:51.330+05:30")
public class GeosearchLocation   {
  @SerializedName("address")
  private MatchedAddress address = null;

  @SerializedName("distance")
  private Distance distance = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  @SerializedName("totalUnitCount")
  private Integer totalUnitCount = null;

  @SerializedName("ranges")
  private List<TypeaheadRange> ranges = new ArrayList<TypeaheadRange>();

  public GeosearchLocation address(MatchedAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getAddress() {
    return address;
  }

  public void setAddress(MatchedAddress address) {
    this.address = address;
  }

  public GeosearchLocation distance(Distance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Distance getDistance() {
    return distance;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  public GeosearchLocation geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public GeosearchLocation totalUnitCount(Integer totalUnitCount) {
    this.totalUnitCount = totalUnitCount;
    return this;
  }

   /**
   * Get totalUnitCount
   * @return totalUnitCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalUnitCount() {
    return totalUnitCount;
  }

  public void setTotalUnitCount(Integer totalUnitCount) {
    this.totalUnitCount = totalUnitCount;
  }

  public GeosearchLocation ranges(List<TypeaheadRange> ranges) {
    this.ranges = ranges;
    return this;
  }

   /**
   * Get ranges
   * @return ranges
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TypeaheadRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<TypeaheadRange> ranges) {
    this.ranges = ranges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeosearchLocation geosearchLocation = (GeosearchLocation) o;
    return Objects.equals(this.address, geosearchLocation.address) &&
        Objects.equals(this.distance, geosearchLocation.distance) &&
        Objects.equals(this.geometry, geosearchLocation.geometry) &&
        Objects.equals(this.totalUnitCount, geosearchLocation.totalUnitCount) &&
        Objects.equals(this.ranges, geosearchLocation.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, distance, geometry, totalUnitCount, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeosearchLocation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    totalUnitCount: ").append(toIndentedString(totalUnitCount)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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

