/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cc_java;

/**
 *
 * @author DevGlee
 */
public class Compte {

    public static void main(String[] args) {

        Compte_Bancaire c1 = new Compte_Bancaire(1, "Lahm", "Phillipe", 400);
        Compte_Bancaire c2 = new Compte_Bancaire(2,"TheKid","Billy", -1000);
        
        CompteEpargne cp1 = new CompteEpargne(50);
        cp1.getSolde();
        
        //c1.crediter(0);
        //c1.retrait(0);
       // c1.afficher();
        
       
        //c2.retrait(0);
        //c2.afficher();
        
        

    }

}
