
package com.pmudemo.model;

import java.io.Serializable;
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
    "nom",
    "numPmu",
    "age",
    "sexe",
    "race",
    "statut",
    "oeilleres",
    "proprietaire",
    "entraineur",
    "driver",
    "driverChange",
    "robe",
    "indicateurInedit",
    "musique",
    "nombreCourses",
    "nombreVictoires",
    "nombrePlaces",
    "nombrePlacesSecond",
    "nombrePlacesTroisieme",
    "gainsParticipant",
    "handicapValeur",
    "nomPere",
    "nomMere",
    "nomPereMere",
    "ordreArrivee",
    "jumentPleine",
    "engagement",
    "supplement",
    "handicapPoids",
    "poidsConditionMonteChange",
    "dernierRapportDirect",
    "dernierRapportReference",
    "urlCasaque",
    "eleveur",
    "allure",
    "distanceChevalPrecedent",
    "incident"
})
public class Participant implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("nom")
    private String nom;
    @JsonProperty("numPmu")
    private Integer numPmu;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("sexe")
    private String sexe;
    @JsonProperty("race")
    private String race;
    @JsonProperty("statut")
    private String statut;
    @JsonProperty("oeilleres")
    private String oeilleres;
    @JsonProperty("proprietaire")
    private String proprietaire;
    @JsonProperty("entraineur")
    private String entraineur;
    @JsonProperty("driver")
    private String driver;
    @JsonProperty("driverChange")
    private Boolean driverChange;
    @JsonProperty("robe")
    private Robe robe;
    @JsonProperty("indicateurInedit")
    private Boolean indicateurInedit;
    @JsonProperty("musique")
    private String musique;
    @JsonProperty("nombreCourses")
    private Integer nombreCourses;
    @JsonProperty("nombreVictoires")
    private Integer nombreVictoires;
    @JsonProperty("nombrePlaces")
    private Integer nombrePlaces;
    @JsonProperty("nombrePlacesSecond")
    private Integer nombrePlacesSecond;
    @JsonProperty("nombrePlacesTroisieme")
    private Integer nombrePlacesTroisieme;
    @JsonProperty("gainsParticipant")
    private GainsParticipant gainsParticipant;
    @JsonProperty("handicapValeur")
    private Double handicapValeur;
    @JsonProperty("nomPere")
    private String nomPere;
    @JsonProperty("nomMere")
    private String nomMere;
    @JsonProperty("nomPereMere")
    private String nomPereMere;
    @JsonProperty("ordreArrivee")
    private Integer ordreArrivee;
    @JsonProperty("jumentPleine")
    private Boolean jumentPleine;
    @JsonProperty("engagement")
    private Boolean engagement;
    @JsonProperty("supplement")
    private Integer supplement;
    @JsonProperty("handicapPoids")
    private Integer handicapPoids;
    @JsonProperty("poidsConditionMonteChange")
    private Boolean poidsConditionMonteChange;
    @JsonProperty("dernierRapportDirect")
    private DernierRapportDirect dernierRapportDirect;
    @JsonProperty("dernierRapportReference")
    private DernierRapportReference dernierRapportReference;
    @JsonProperty("urlCasaque")
    private String urlCasaque;
    @JsonProperty("eleveur")
    private String eleveur;
    @JsonProperty("allure")
    private String allure;
    @JsonProperty("distanceChevalPrecedent")
    private DistanceChevalPrecedent distanceChevalPrecedent;
    @JsonProperty("incident")
    private String incident;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonProperty("numPmu")
    public Integer getNumPmu() {
        return numPmu;
    }

    @JsonProperty("numPmu")
    public void setNumPmu(Integer numPmu) {
        this.numPmu = numPmu;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonProperty("sexe")
    public String getSexe() {
        return sexe;
    }

    @JsonProperty("sexe")
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @JsonProperty("race")
    public String getRace() {
        return race;
    }

    @JsonProperty("race")
    public void setRace(String race) {
        this.race = race;
    }

    @JsonProperty("statut")
    public String getStatut() {
        return statut;
    }

    @JsonProperty("statut")
    public void setStatut(String statut) {
        this.statut = statut;
    }

    @JsonProperty("oeilleres")
    public String getOeilleres() {
        return oeilleres;
    }

    @JsonProperty("oeilleres")
    public void setOeilleres(String oeilleres) {
        this.oeilleres = oeilleres;
    }

    @JsonProperty("proprietaire")
    public String getProprietaire() {
        return proprietaire;
    }

    @JsonProperty("proprietaire")
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    @JsonProperty("entraineur")
    public String getEntraineur() {
        return entraineur;
    }

    @JsonProperty("entraineur")
    public void setEntraineur(String entraineur) {
        this.entraineur = entraineur;
    }

    @JsonProperty("driver")
    public String getDriver() {
        return driver;
    }

    @JsonProperty("driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    @JsonProperty("driverChange")
    public Boolean getDriverChange() {
        return driverChange;
    }

    @JsonProperty("driverChange")
    public void setDriverChange(Boolean driverChange) {
        this.driverChange = driverChange;
    }

    @JsonProperty("robe")
    public Robe getRobe() {
        return robe;
    }

    @JsonProperty("robe")
    public void setRobe(Robe robe) {
        this.robe = robe;
    }

    @JsonProperty("indicateurInedit")
    public Boolean getIndicateurInedit() {
        return indicateurInedit;
    }

    @JsonProperty("indicateurInedit")
    public void setIndicateurInedit(Boolean indicateurInedit) {
        this.indicateurInedit = indicateurInedit;
    }

    @JsonProperty("musique")
    public String getMusique() {
        return musique;
    }

    @JsonProperty("musique")
    public void setMusique(String musique) {
        this.musique = musique;
    }

    @JsonProperty("nombreCourses")
    public Integer getNombreCourses() {
        return nombreCourses;
    }

    @JsonProperty("nombreCourses")
    public void setNombreCourses(Integer nombreCourses) {
        this.nombreCourses = nombreCourses;
    }

    @JsonProperty("nombreVictoires")
    public Integer getNombreVictoires() {
        return nombreVictoires;
    }

    @JsonProperty("nombreVictoires")
    public void setNombreVictoires(Integer nombreVictoires) {
        this.nombreVictoires = nombreVictoires;
    }

    @JsonProperty("nombrePlaces")
    public Integer getNombrePlaces() {
        return nombrePlaces;
    }

    @JsonProperty("nombrePlaces")
    public void setNombrePlaces(Integer nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    @JsonProperty("nombrePlacesSecond")
    public Integer getNombrePlacesSecond() {
        return nombrePlacesSecond;
    }

    @JsonProperty("nombrePlacesSecond")
    public void setNombrePlacesSecond(Integer nombrePlacesSecond) {
        this.nombrePlacesSecond = nombrePlacesSecond;
    }

    @JsonProperty("nombrePlacesTroisieme")
    public Integer getNombrePlacesTroisieme() {
        return nombrePlacesTroisieme;
    }

    @JsonProperty("nombrePlacesTroisieme")
    public void setNombrePlacesTroisieme(Integer nombrePlacesTroisieme) {
        this.nombrePlacesTroisieme = nombrePlacesTroisieme;
    }

    @JsonProperty("gainsParticipant")
    public GainsParticipant getGainsParticipant() {
        return gainsParticipant;
    }

    @JsonProperty("gainsParticipant")
    public void setGainsParticipant(GainsParticipant gainsParticipant) {
        this.gainsParticipant = gainsParticipant;
    }

    @JsonProperty("handicapValeur")
    public Double getHandicapValeur() {
        return handicapValeur;
    }

    @JsonProperty("handicapValeur")
    public void setHandicapValeur(Double handicapValeur) {
        this.handicapValeur = handicapValeur;
    }

    @JsonProperty("nomPere")
    public String getNomPere() {
        return nomPere;
    }

    @JsonProperty("nomPere")
    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    @JsonProperty("nomMere")
    public String getNomMere() {
        return nomMere;
    }

    @JsonProperty("nomMere")
    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    @JsonProperty("nomPereMere")
    public String getNomPereMere() {
        return nomPereMere;
    }

    @JsonProperty("nomPereMere")
    public void setNomPereMere(String nomPereMere) {
        this.nomPereMere = nomPereMere;
    }

    @JsonProperty("ordreArrivee")
    public Integer getOrdreArrivee() {
        return ordreArrivee;
    }

    @JsonProperty("ordreArrivee")
    public void setOrdreArrivee(Integer ordreArrivee) {
        this.ordreArrivee = ordreArrivee;
    }

    @JsonProperty("jumentPleine")
    public Boolean getJumentPleine() {
        return jumentPleine;
    }

    @JsonProperty("jumentPleine")
    public void setJumentPleine(Boolean jumentPleine) {
        this.jumentPleine = jumentPleine;
    }

    @JsonProperty("engagement")
    public Boolean getEngagement() {
        return engagement;
    }

    @JsonProperty("engagement")
    public void setEngagement(Boolean engagement) {
        this.engagement = engagement;
    }

    @JsonProperty("supplement")
    public Integer getSupplement() {
        return supplement;
    }

    @JsonProperty("supplement")
    public void setSupplement(Integer supplement) {
        this.supplement = supplement;
    }

    @JsonProperty("handicapPoids")
    public Integer getHandicapPoids() {
        return handicapPoids;
    }

    @JsonProperty("handicapPoids")
    public void setHandicapPoids(Integer handicapPoids) {
        this.handicapPoids = handicapPoids;
    }

    @JsonProperty("poidsConditionMonteChange")
    public Boolean getPoidsConditionMonteChange() {
        return poidsConditionMonteChange;
    }

    @JsonProperty("poidsConditionMonteChange")
    public void setPoidsConditionMonteChange(Boolean poidsConditionMonteChange) {
        this.poidsConditionMonteChange = poidsConditionMonteChange;
    }

    @JsonProperty("dernierRapportDirect")
    public DernierRapportDirect getDernierRapportDirect() {
        return dernierRapportDirect;
    }

    @JsonProperty("dernierRapportDirect")
    public void setDernierRapportDirect(DernierRapportDirect dernierRapportDirect) {
        this.dernierRapportDirect = dernierRapportDirect;
    }

    @JsonProperty("dernierRapportReference")
    public DernierRapportReference getDernierRapportReference() {
        return dernierRapportReference;
    }

    @JsonProperty("dernierRapportReference")
    public void setDernierRapportReference(DernierRapportReference dernierRapportReference) {
        this.dernierRapportReference = dernierRapportReference;
    }

    @JsonProperty("urlCasaque")
    public String getUrlCasaque() {
        return urlCasaque;
    }

    @JsonProperty("urlCasaque")
    public void setUrlCasaque(String urlCasaque) {
        this.urlCasaque = urlCasaque;
    }

    @JsonProperty("eleveur")
    public String getEleveur() {
        return eleveur;
    }

    @JsonProperty("eleveur")
    public void setEleveur(String eleveur) {
        this.eleveur = eleveur;
    }

    @JsonProperty("allure")
    public String getAllure() {
        return allure;
    }

    @JsonProperty("allure")
    public void setAllure(String allure) {
        this.allure = allure;
    }

    @JsonProperty("distanceChevalPrecedent")
    public DistanceChevalPrecedent getDistanceChevalPrecedent() {
        return distanceChevalPrecedent;
    }

    @JsonProperty("distanceChevalPrecedent")
    public void setDistanceChevalPrecedent(DistanceChevalPrecedent distanceChevalPrecedent) {
        this.distanceChevalPrecedent = distanceChevalPrecedent;
    }

    @JsonProperty("incident")
    public String getIncident() {
        return incident;
    }

    @JsonProperty("incident")
    public void setIncident(String incident) {
        this.incident = incident;
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
