/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Courriel;
import modele.PieceJointe;

/**
 *
 * @author leneveuT
 */
public class PieceJointeTest {
    public static void main(String[] args) {
      PieceJointe piecejointe = new PieceJointe(1, "drive/pdf", "Fichier PDF");
      Courriel courriel = new Courriel(1, "Nouvelle vente", "27/07/2018");
      piecejointe.addUnCourriel(courriel);
        
      for(int i = 0; i <  piecejointe.getLesCourriels().size(); i++) {
          System.out.println(piecejointe.getChemin() + " " + piecejointe.getDescription() + " " + piecejointe.getLesCourriels().get(i).getNom());
      }
    }
}
