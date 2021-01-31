/*
 * eGov Property Registry System.
 * APIs for Property Registry module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * OccupancyType
 */

public class OccupancyType {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("active")
  private Boolean active = null;

  public OccupancyType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the occupancy
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OccupancyType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * code of the OccupancyType
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OccupancyType active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether OccupancyType is Active or not. If the value is TRUE, then OccupancyType is active, if the value is FALSE then OccupancyType is inactive, default value is TRUE
   * @return active
  **/
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccupancyType occupancyType = (OccupancyType) o;
    return Objects.equals(this.name, occupancyType.name) &&
        Objects.equals(this.code, occupancyType.code) &&
        Objects.equals(this.active, occupancyType.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccupancyType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
