
package com.pmudemo.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "participants",
    "ecuries",
    "spriteCasaques",
    "cached"
})
public class Course implements Serializable{

    @JsonProperty("participants")
    private List<Participant> participants = null;
    @JsonProperty("ecuries")
    private List<Object> ecuries = null;
    @JsonProperty("spriteCasaques")
    private List<SpriteCasaque> spriteCasaques = null;
    @JsonProperty("cached")
    private Boolean cached;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @JsonProperty("ecuries")
    public List<Object> getEcuries() {
        return ecuries;
    }

    @JsonProperty("ecuries")
    public void setEcuries(List<Object> ecuries) {
        this.ecuries = ecuries;
    }

    @JsonProperty("spriteCasaques")
    public List<SpriteCasaque> getSpriteCasaques() {
        return spriteCasaques;
    }

    @JsonProperty("spriteCasaques")
    public void setSpriteCasaques(List<SpriteCasaque> spriteCasaques) {
        this.spriteCasaques = spriteCasaques;
    }

    @JsonProperty("cached")
    public Boolean getCached() {
        return cached;
    }

    @JsonProperty("cached")
    public void setCached(Boolean cached) {
        this.cached = cached;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Example [participants=" + participants + ", ecuries=" + ecuries + ", spriteCasaques=" + spriteCasaques
				+ ", cached=" + cached + ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
