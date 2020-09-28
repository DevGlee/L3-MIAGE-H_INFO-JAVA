/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exo_java;

/**
 *
 * @author DevGlee
 */
import java.util.Scanner;

public class Compte_Bancaire {

    int id;
    String nom;
    String prenom;
    float solde;
    float virement;

    Compte_Bancaire(int id, String nom, String prenom, float solde) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    public float crediter(float virement) {
        System.out.println("Saisissez le montant du virement");
        float new_solde = new Scanner(System.in).nextInt();
        new_solde = solde + virement;
        System.out.println("Votre compte a été crédité de : " + virement);
        return solde;

    }

}
