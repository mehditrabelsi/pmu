
package com.pmudemo.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "libelleCourt",
    "libelleLong",
    "code",
    "identifiant"
})
public class DistanceChevalPrecedent {

    @JsonProperty("libelleCourt")
    private String libelleCourt;
    @JsonProperty("libelleLong")
    private String libelleLong;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("identifiant")
    private String identifiant;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("libelleCourt")
    public String getLibelleCourt() {
        return libelleCourt;
    }

    @JsonProperty("libelleCourt")
    public void setLibelleCourt(String libelleCourt) {
        this.libelleCourt = libelleCourt;
    }

    @JsonProperty("libelleLong")
    public String getLibelleLong() {
        return libelleLong;
    }

    @JsonProperty("libelleLong")
    public void setLibelleLong(String libelleLong) {
        this.libelleLong = libelleLong;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("identifiant")
    public String getIdentifiant() {
        return identifiant;
    }

    @JsonProperty("identifiant")
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
