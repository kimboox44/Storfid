package com.innobyte.storfid.DomainLayer.Models;

import android.media.Image;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Kimboo on 12/01/2017.
 */

public class Produit extends RealmObject {

    @PrimaryKey
    private long id;
    private String libelle;
    private String codeBar;
    private String codeRfid;
    private Date creationDate;
    private String codeProduit;
    private Utilisateur creationBy;
    private Utilisateur ModifiedBy;
    private int prixVente;
    private  boolean isActive;
    private Fournisseur fournisseur;
    private CategorieProduit categorieProduit;
    private int prixAchat;
    private boolean isTaxable;
    private String status; // sold or in house
    private UniteMesure uniteMesure;
    private int QtsStock;
    private int QtsReorder;
    private String description;

    private RealmList<Caracteristique> caracteristiques;
    private int ratings; // rating from 0 to 10
    private String marque;
    private String couleur;
    private int poids;
    private String poidsUnite;
    private RealmList<ImageGallery> images;
    private String model;
    private String sku; // The Stock Keeping Unit (SKU), "Unité, Kg, g, piéce...etc"

    public Produit() {

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }

    public String getCodeRfid() {
        return codeRfid;
    }

    public void setCodeRfid(String codeRfid) {
        this.codeRfid = codeRfid;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public Utilisateur getCreationBy() {
        return creationBy;
    }

    public void setCreationBy(Utilisateur creationBy) {
        this.creationBy = creationBy;
    }

    public Utilisateur getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(Utilisateur modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UniteMesure getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(UniteMesure uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public int getQtsStock() {
        return QtsStock;
    }

    public void setQtsStock(int qtsStock) {
        QtsStock = qtsStock;
    }

    public int getQtsReorder() {
        return QtsReorder;
    }

    public void setQtsReorder(int qtsReorder) {
        QtsReorder = qtsReorder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealmList<Caracteristique> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(RealmList<Caracteristique> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getPoidsUnite() {
        return poidsUnite;
    }

    public void setPoidsUnite(String poidsUnite) {
        this.poidsUnite = poidsUnite;
    }

    public RealmList<ImageGallery> getImages() {
        return images;
    }

    public void setImages(RealmList<ImageGallery> images) {
        this.images = images;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
