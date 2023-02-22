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
import com.precisely.apis.model.AssetsAndWealthTheme;
import com.precisely.apis.model.EducationTheme;
import com.precisely.apis.model.EmploymentTheme;
import com.precisely.apis.model.ExpenditureTheme;
import com.precisely.apis.model.HealthTheme;
import com.precisely.apis.model.HouseholdsTheme;
import com.precisely.apis.model.HousingTheme;
import com.precisely.apis.model.IncomeTheme;
import com.precisely.apis.model.PopulationTheme;
import com.precisely.apis.model.RaceAndEthnicityTheme;
import com.precisely.apis.model.SupplyAndDemandTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DemographicsThemesV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class DemographicsThemesV2 {
  public static final String SERIALIZED_NAME_BOUNDARY_ID = "boundaryId";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_ID)
  private String boundaryId;

  public static final String SERIALIZED_NAME_POPULATION_THEME = "populationTheme";
  @SerializedName(SERIALIZED_NAME_POPULATION_THEME)
  private PopulationTheme populationTheme;

  public static final String SERIALIZED_NAME_RACE_AND_ETHNICITY_THEME = "raceAndEthnicityTheme";
  @SerializedName(SERIALIZED_NAME_RACE_AND_ETHNICITY_THEME)
  private RaceAndEthnicityTheme raceAndEthnicityTheme;

  public static final String SERIALIZED_NAME_HEALTH_THEME = "healthTheme";
  @SerializedName(SERIALIZED_NAME_HEALTH_THEME)
  private HealthTheme healthTheme;

  public static final String SERIALIZED_NAME_EDUCATION_THEME = "educationTheme";
  @SerializedName(SERIALIZED_NAME_EDUCATION_THEME)
  private EducationTheme educationTheme;

  public static final String SERIALIZED_NAME_INCOME_THEME = "incomeTheme";
  @SerializedName(SERIALIZED_NAME_INCOME_THEME)
  private IncomeTheme incomeTheme;

  public static final String SERIALIZED_NAME_ASSETS_AND_WEALTH_THEME = "assetsAndWealthTheme";
  @SerializedName(SERIALIZED_NAME_ASSETS_AND_WEALTH_THEME)
  private AssetsAndWealthTheme assetsAndWealthTheme;

  public static final String SERIALIZED_NAME_HOUSEHOLDS_THEME = "householdsTheme";
  @SerializedName(SERIALIZED_NAME_HOUSEHOLDS_THEME)
  private HouseholdsTheme householdsTheme;

  public static final String SERIALIZED_NAME_HOUSING_THEME = "housingTheme";
  @SerializedName(SERIALIZED_NAME_HOUSING_THEME)
  private HousingTheme housingTheme;

  public static final String SERIALIZED_NAME_EMPLOYMENT_THEME = "employmentTheme";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_THEME)
  private EmploymentTheme employmentTheme;

  public static final String SERIALIZED_NAME_EXPENDITURE_THEME = "expenditureTheme";
  @SerializedName(SERIALIZED_NAME_EXPENDITURE_THEME)
  private ExpenditureTheme expenditureTheme;

  public static final String SERIALIZED_NAME_SUPPLY_AND_DEMAND_THEME = "supplyAndDemandTheme";
  @SerializedName(SERIALIZED_NAME_SUPPLY_AND_DEMAND_THEME)
  private SupplyAndDemandTheme supplyAndDemandTheme;

  public DemographicsThemesV2() { 
  }

  public DemographicsThemesV2 boundaryId(String boundaryId) {
    
    this.boundaryId = boundaryId;
    return this;
  }

   /**
   * Get boundaryId
   * @return boundaryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoundaryId() {
    return boundaryId;
  }


  public void setBoundaryId(String boundaryId) {
    this.boundaryId = boundaryId;
  }


  public DemographicsThemesV2 populationTheme(PopulationTheme populationTheme) {
    
    this.populationTheme = populationTheme;
    return this;
  }

   /**
   * Get populationTheme
   * @return populationTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PopulationTheme getPopulationTheme() {
    return populationTheme;
  }


  public void setPopulationTheme(PopulationTheme populationTheme) {
    this.populationTheme = populationTheme;
  }


  public DemographicsThemesV2 raceAndEthnicityTheme(RaceAndEthnicityTheme raceAndEthnicityTheme) {
    
    this.raceAndEthnicityTheme = raceAndEthnicityTheme;
    return this;
  }

   /**
   * Get raceAndEthnicityTheme
   * @return raceAndEthnicityTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RaceAndEthnicityTheme getRaceAndEthnicityTheme() {
    return raceAndEthnicityTheme;
  }


  public void setRaceAndEthnicityTheme(RaceAndEthnicityTheme raceAndEthnicityTheme) {
    this.raceAndEthnicityTheme = raceAndEthnicityTheme;
  }


  public DemographicsThemesV2 healthTheme(HealthTheme healthTheme) {
    
    this.healthTheme = healthTheme;
    return this;
  }

   /**
   * Get healthTheme
   * @return healthTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HealthTheme getHealthTheme() {
    return healthTheme;
  }


  public void setHealthTheme(HealthTheme healthTheme) {
    this.healthTheme = healthTheme;
  }


  public DemographicsThemesV2 educationTheme(EducationTheme educationTheme) {
    
    this.educationTheme = educationTheme;
    return this;
  }

   /**
   * Get educationTheme
   * @return educationTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EducationTheme getEducationTheme() {
    return educationTheme;
  }


  public void setEducationTheme(EducationTheme educationTheme) {
    this.educationTheme = educationTheme;
  }


  public DemographicsThemesV2 incomeTheme(IncomeTheme incomeTheme) {
    
    this.incomeTheme = incomeTheme;
    return this;
  }

   /**
   * Get incomeTheme
   * @return incomeTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeTheme getIncomeTheme() {
    return incomeTheme;
  }


  public void setIncomeTheme(IncomeTheme incomeTheme) {
    this.incomeTheme = incomeTheme;
  }


  public DemographicsThemesV2 assetsAndWealthTheme(AssetsAndWealthTheme assetsAndWealthTheme) {
    
    this.assetsAndWealthTheme = assetsAndWealthTheme;
    return this;
  }

   /**
   * Get assetsAndWealthTheme
   * @return assetsAndWealthTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetsAndWealthTheme getAssetsAndWealthTheme() {
    return assetsAndWealthTheme;
  }


  public void setAssetsAndWealthTheme(AssetsAndWealthTheme assetsAndWealthTheme) {
    this.assetsAndWealthTheme = assetsAndWealthTheme;
  }


  public DemographicsThemesV2 householdsTheme(HouseholdsTheme householdsTheme) {
    
    this.householdsTheme = householdsTheme;
    return this;
  }

   /**
   * Get householdsTheme
   * @return householdsTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HouseholdsTheme getHouseholdsTheme() {
    return householdsTheme;
  }


  public void setHouseholdsTheme(HouseholdsTheme householdsTheme) {
    this.householdsTheme = householdsTheme;
  }


  public DemographicsThemesV2 housingTheme(HousingTheme housingTheme) {
    
    this.housingTheme = housingTheme;
    return this;
  }

   /**
   * Get housingTheme
   * @return housingTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HousingTheme getHousingTheme() {
    return housingTheme;
  }


  public void setHousingTheme(HousingTheme housingTheme) {
    this.housingTheme = housingTheme;
  }


  public DemographicsThemesV2 employmentTheme(EmploymentTheme employmentTheme) {
    
    this.employmentTheme = employmentTheme;
    return this;
  }

   /**
   * Get employmentTheme
   * @return employmentTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentTheme getEmploymentTheme() {
    return employmentTheme;
  }


  public void setEmploymentTheme(EmploymentTheme employmentTheme) {
    this.employmentTheme = employmentTheme;
  }


  public DemographicsThemesV2 expenditureTheme(ExpenditureTheme expenditureTheme) {
    
    this.expenditureTheme = expenditureTheme;
    return this;
  }

   /**
   * Get expenditureTheme
   * @return expenditureTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpenditureTheme getExpenditureTheme() {
    return expenditureTheme;
  }


  public void setExpenditureTheme(ExpenditureTheme expenditureTheme) {
    this.expenditureTheme = expenditureTheme;
  }


  public DemographicsThemesV2 supplyAndDemandTheme(SupplyAndDemandTheme supplyAndDemandTheme) {
    
    this.supplyAndDemandTheme = supplyAndDemandTheme;
    return this;
  }

   /**
   * Get supplyAndDemandTheme
   * @return supplyAndDemandTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SupplyAndDemandTheme getSupplyAndDemandTheme() {
    return supplyAndDemandTheme;
  }


  public void setSupplyAndDemandTheme(SupplyAndDemandTheme supplyAndDemandTheme) {
    this.supplyAndDemandTheme = supplyAndDemandTheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemographicsThemesV2 demographicsThemesV2 = (DemographicsThemesV2) o;
    return Objects.equals(this.boundaryId, demographicsThemesV2.boundaryId) &&
        Objects.equals(this.populationTheme, demographicsThemesV2.populationTheme) &&
        Objects.equals(this.raceAndEthnicityTheme, demographicsThemesV2.raceAndEthnicityTheme) &&
        Objects.equals(this.healthTheme, demographicsThemesV2.healthTheme) &&
        Objects.equals(this.educationTheme, demographicsThemesV2.educationTheme) &&
        Objects.equals(this.incomeTheme, demographicsThemesV2.incomeTheme) &&
        Objects.equals(this.assetsAndWealthTheme, demographicsThemesV2.assetsAndWealthTheme) &&
        Objects.equals(this.householdsTheme, demographicsThemesV2.householdsTheme) &&
        Objects.equals(this.housingTheme, demographicsThemesV2.housingTheme) &&
        Objects.equals(this.employmentTheme, demographicsThemesV2.employmentTheme) &&
        Objects.equals(this.expenditureTheme, demographicsThemesV2.expenditureTheme) &&
        Objects.equals(this.supplyAndDemandTheme, demographicsThemesV2.supplyAndDemandTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryId, populationTheme, raceAndEthnicityTheme, healthTheme, educationTheme, incomeTheme, assetsAndWealthTheme, householdsTheme, housingTheme, employmentTheme, expenditureTheme, supplyAndDemandTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsThemesV2 {\n");
    sb.append("    boundaryId: ").append(toIndentedString(boundaryId)).append("\n");
    sb.append("    populationTheme: ").append(toIndentedString(populationTheme)).append("\n");
    sb.append("    raceAndEthnicityTheme: ").append(toIndentedString(raceAndEthnicityTheme)).append("\n");
    sb.append("    healthTheme: ").append(toIndentedString(healthTheme)).append("\n");
    sb.append("    educationTheme: ").append(toIndentedString(educationTheme)).append("\n");
    sb.append("    incomeTheme: ").append(toIndentedString(incomeTheme)).append("\n");
    sb.append("    assetsAndWealthTheme: ").append(toIndentedString(assetsAndWealthTheme)).append("\n");
    sb.append("    householdsTheme: ").append(toIndentedString(householdsTheme)).append("\n");
    sb.append("    housingTheme: ").append(toIndentedString(housingTheme)).append("\n");
    sb.append("    employmentTheme: ").append(toIndentedString(employmentTheme)).append("\n");
    sb.append("    expenditureTheme: ").append(toIndentedString(expenditureTheme)).append("\n");
    sb.append("    supplyAndDemandTheme: ").append(toIndentedString(supplyAndDemandTheme)).append("\n");
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

