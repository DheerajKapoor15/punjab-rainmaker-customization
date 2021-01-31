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

/**
 * Source of a constructionDetail data. The constructionDetail will be created in a system based on the data avaialble in their manual records or during field survey. There can be more from client to client.
 */
 
public enum Source {
  MUNICIPAL_RECORDS("MUNICIPAL_RECORDS"),
  FIELD_SURVEY("FIELD_SURVEY");

  private String value;

  Source(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Source fromValue(String text) {
    for (Source b : Source.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  
}