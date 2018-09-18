/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;
import modele.Vente;

/**
 *
 * @author leneveuT
 */
public class LieuTest {
    public static void main(String[] args) {
      Lieu lieu = new Lieu(1, "Saint-Cloud", 4, "test");
      Vente vente1 = new Vente(4, "Nuage", "27/07/2018");
      Vente vente2 = new Vente(2, "Trais d'or", "27/07/2018");
      lieu.addUneVente(vente1);
      lieu.addUneVente(vente2);
      
      for(int i = 0; i < lieu.getLesVentes().size(); i++) {
          System.out.println(lieu.getLesVentes().get(i).getNom() + " " + lieu.getVille());
      }
    }
}
