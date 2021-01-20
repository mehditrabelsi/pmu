
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
    "typePari",
    "rapport",
    "typeRapport",
    "indicateurTendance",
    "nombreIndicateurTendance",
    "dateRapport",
    "permutation",
    "favoris",
    "numPmu1",
    "grossePrise"
})
public class DernierRapportReference {

    @JsonProperty("typePari")
    private String typePari;
    @JsonProperty("rapport")
    private Double rapport;
    @JsonProperty("typeRapport")
    private String typeRapport;
    @JsonProperty("indicateurTendance")
    private String indicateurTendance;
    @JsonProperty("nombreIndicateurTendance")
    private Double nombreIndicateurTendance;
    @JsonProperty("dateRapport")
    private Long  dateRapport;
    @JsonProperty("permutation")
    private Integer permutation;
    @JsonProperty("favoris")
    private Boolean favoris;
    @JsonProperty("numPmu1")
    private Integer numPmu1;
    @JsonProperty("grossePrise")
    private Boolean grossePrise;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("typePari")
    public String getTypePari() {
        return typePari;
    }

    @JsonProperty("typePari")
    public void setTypePari(String typePari) {
        this.typePari = typePari;
    }

    @JsonProperty("rapport")
    public Double getRapport() {
        return rapport;
    }

    @JsonProperty("rapport")
    public void setRapport(Double rapport) {
        this.rapport = rapport;
    }

    @JsonProperty("typeRapport")
    public String getTypeRapport() {
        return typeRapport;
    }

    @JsonProperty("typeRapport")
    public void setTypeRapport(String typeRapport) {
        this.typeRapport = typeRapport;
    }

    @JsonProperty("indicateurTendance")
    public String getIndicateurTendance() {
        return indicateurTendance;
    }

    @JsonProperty("indicateurTendance")
    public void setIndicateurTendance(String indicateurTendance) {
        this.indicateurTendance = indicateurTendance;
    }

    @JsonProperty("nombreIndicateurTendance")
    public Double getNombreIndicateurTendance() {
        return nombreIndicateurTendance;
    }

    @JsonProperty("nombreIndicateurTendance")
    public void setNombreIndicateurTendance(Double nombreIndicateurTendance) {
        this.nombreIndicateurTendance = nombreIndicateurTendance;
    }

    @JsonProperty("dateRapport")
    public Long  getDateRapport() {
        return dateRapport;
    }

    @JsonProperty("dateRapport")
    public void setDateRapport(Long  dateRapport) {
        this.dateRapport = dateRapport;
    }

    @JsonProperty("permutation")
    public Integer getPermutation() {
        return permutation;
    }

    @JsonProperty("permutation")
    public void setPermutation(Integer permutation) {
        this.permutation = permutation;
    }

    @JsonProperty("favoris")
    public Boolean getFavoris() {
        return favoris;
    }

    @JsonProperty("favoris")
    public void setFavoris(Boolean favoris) {
        this.favoris = favoris;
    }

    @JsonProperty("numPmu1")
    public Integer getNumPmu1() {
        return numPmu1;
    }

    @JsonProperty("numPmu1")
    public void setNumPmu1(Integer numPmu1) {
        this.numPmu1 = numPmu1;
    }

    @JsonProperty("grossePrise")
    public Boolean getGrossePrise() {
        return grossePrise;
    }

    @JsonProperty("grossePrise")
    public void setGrossePrise(Boolean grossePrise) {
        this.grossePrise = grossePrise;
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
