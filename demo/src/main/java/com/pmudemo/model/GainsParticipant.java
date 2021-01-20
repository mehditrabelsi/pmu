
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
    "gainsCarriere",
    "gainsVictoires",
    "gainsPlace",
    "gainsAnneeEnCours",
    "gainsAnneePrecedente"
})
public class GainsParticipant {

    @JsonProperty("gainsCarriere")
    private Integer gainsCarriere;
    @JsonProperty("gainsVictoires")
    private Integer gainsVictoires;
    @JsonProperty("gainsPlace")
    private Integer gainsPlace;
    @JsonProperty("gainsAnneeEnCours")
    private Integer gainsAnneeEnCours;
    @JsonProperty("gainsAnneePrecedente")
    private Integer gainsAnneePrecedente;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gainsCarriere")
    public Integer getGainsCarriere() {
        return gainsCarriere;
    }

    @JsonProperty("gainsCarriere")
    public void setGainsCarriere(Integer gainsCarriere) {
        this.gainsCarriere = gainsCarriere;
    }

    @JsonProperty("gainsVictoires")
    public Integer getGainsVictoires() {
        return gainsVictoires;
    }

    @JsonProperty("gainsVictoires")
    public void setGainsVictoires(Integer gainsVictoires) {
        this.gainsVictoires = gainsVictoires;
    }

    @JsonProperty("gainsPlace")
    public Integer getGainsPlace() {
        return gainsPlace;
    }

    @JsonProperty("gainsPlace")
    public void setGainsPlace(Integer gainsPlace) {
        this.gainsPlace = gainsPlace;
    }

    @JsonProperty("gainsAnneeEnCours")
    public Integer getGainsAnneeEnCours() {
        return gainsAnneeEnCours;
    }

    @JsonProperty("gainsAnneeEnCours")
    public void setGainsAnneeEnCours(Integer gainsAnneeEnCours) {
        this.gainsAnneeEnCours = gainsAnneeEnCours;
    }

    @JsonProperty("gainsAnneePrecedente")
    public Integer getGainsAnneePrecedente() {
        return gainsAnneePrecedente;
    }

    @JsonProperty("gainsAnneePrecedente")
    public void setGainsAnneePrecedente(Integer gainsAnneePrecedente) {
        this.gainsAnneePrecedente = gainsAnneePrecedente;
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
