package com.ocr.library.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;


@Entity
public class Ouvrage {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="titre")
    private String titre;

    @Column(name="auteur")
    private String auteur;

    @Column(name="genre")
    private String genre;

    @Column(name="cote")
    private String cote;

    @Column(name="anneeEdition")
    private String anneeEdition;

    @Column(name="nombrePages")
    private String nombrePages;

    @Column(name="nombreExemplairesDispos")
    private int nbExemplairesDispo;

    @Column(name="statut")
    private boolean statut;

    @JsonManagedReference
    @OneToMany(mappedBy = "ouvrage", fetch = FetchType.EAGER)
    private List <Exemplaire> exemplaires;

    @JsonBackReference
    @OneToMany(mappedBy = "ouvrage")
    private List<Pret> prets;


    public Ouvrage() {
    }

    public Ouvrage(int id, String titre, String auteur, String genre, String cote, String anneeEdition, String nombrePages,
                   int nbExemplairesDispo, boolean statut, List<Exemplaire> exemplaires, List<Pret> prets) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.cote = cote;
        this.anneeEdition = anneeEdition;
        this.nombrePages = nombrePages;
        this.nbExemplairesDispo = nbExemplairesDispo;
        this.statut = statut;
        this.exemplaires = exemplaires;
        this.prets = prets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCote() {
        return cote;
    }

    public void setCote(String cote) {
        this.cote = cote;
    }

    public String getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(String anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public String getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(String nombrePages) {
        this.nombrePages = nombrePages;
    }

    public int getNbExemplairesDispo() {
        return nbExemplairesDispo;
    }

    public void setNbExemplairesDispo(int nbExemplairesDispo) {
        this.nbExemplairesDispo = nbExemplairesDispo;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(List<Exemplaire> exemplaires) {
        this.exemplaires = exemplaires;
    }

    public List<Pret> getPrets() {
        return prets;
    }

    public void setPrets(List<Pret> prets) {
        this.prets = prets;
    }




}
