
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
    "code",
    "libelleCourt",
    "libelleLong"
})
public class Robe {

    @JsonProperty("code")
    private String code;
    @JsonProperty("libelleCourt")
    private String libelleCourt;
    @JsonProperty("libelleLong")
    private String libelleLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
