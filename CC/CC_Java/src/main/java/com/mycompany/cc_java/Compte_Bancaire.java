package com.mycompany.cc_java;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DevGlee
 */
public class Compte_Bancaire {
//ATTRIBUTS

    int id;
    String nom;
    String prenom;
    float solde;
//CONSTRUCTEURS

    public Compte_Bancaire(int id, String nom, String prenom, float solde) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    public void afficher() {

        System.out.println("Id:" + id + " Nom:" + nom + " Prenom:" + prenom + " Solde: " + solde);
    }

    ;
    
    public void crediter( float solde) {
        System.out.println("Votre solde est de :" +this.solde);
        System.out.println("Saisissez le montant du virement");
        float virement = new Scanner(System.in).nextInt();
        
        this.solde = this.solde + virement;
        System.out.println("Votre compte a été crédité de : " + solde);
        

    }
    
    public  void retrait(float solde){
        System.out.println("Votre solde est de :" +this.solde);
        System.out.println("Saisissez le montant du retrait");
        if(solde<=-999){
        float retrait = new Scanner(System.in).nextInt();
        
        this.solde = this.solde - retrait;
        System.out.println("Votre compte a été debité de : " + solde);}
        else
        {
        System.out.println("Vous avez atteint votre plafond de retrait !!");
        }
        
    }
    
    public void transfert(float solde){
        System.out.println("Votre solde est de :" +this.solde);
        System.out.println("Saisissez le montant du transfert");
        
        float transf = new Scanner(System.in).nextInt();
        
        this.solde = this.solde - transf;
        System.out.println("Votre compte a été debité de : " + solde);
    
    }
       
        
       
       
    

    //GETTERS
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getSolde() {
        return solde;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
