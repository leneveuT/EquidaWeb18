/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Courriel;
import modele.PieceJointe;
import modele.Vente;

/**
 *
 * @author leneveuT
 */
public class CourrielTest {
    public static void main(String[] args) {
      Courriel courriel = new Courriel(1, "Nouvelle vente", "27/07/2018");
      Vente vente1 = new Vente(4, "Nuage", "27/07/2018");
      courriel.setUneVente(vente1);
      PieceJointe piecejointe1 = new PieceJointe(1, "drive/pdf", "Fichier PDF");
      PieceJointe piecejointe2 = new PieceJointe(1, "drive/word", "Fichier Word");
      courriel.addUnePieceJointe(piecejointe1);
      courriel.addUnePieceJointe(piecejointe2);
              
      for(int i = 0; i < courriel.getLesPiecesJointes().size(); i++) {
          System.out.println(courriel.getNom() + " " + courriel.getLesPiecesJointes().get(i).getChemin() + " " + courriel.getLesPiecesJointes().get(i).getDescription());
      }
    }
}
