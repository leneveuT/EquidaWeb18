/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author leneveuT
 */
public class Courriel {
    private int id;
    private String nom;
    private String dateDebutVente;
    private Vente uneVente;
    private ArrayList<PieceJointe> lesPiecesJointes;

    public Courriel() {
    }

    public Courriel(int id, String nom, String dateDebutVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebutVente() {
        return dateDebutVente;
    }

    public void setDateDebutVente(String dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public Vente getUneVente() {
        return uneVente;
    }

    public void setUneVente(Vente uneVente) {
        this.uneVente = uneVente;
    }

    public ArrayList<PieceJointe> getLesPiecesJointes() {
        return lesPiecesJointes;
    }

    public void setLesPiecesJointes(ArrayList<PieceJointe> lesPiecesJointes) {
        this.lesPiecesJointes = lesPiecesJointes;
    }
    
    public void addUnePieceJointe(PieceJointe unePieceJointe){
        if (lesPiecesJointes == null){
            lesPiecesJointes = new ArrayList<PieceJointe>();
        }
        lesPiecesJointes.add(unePieceJointe);
    }
}
