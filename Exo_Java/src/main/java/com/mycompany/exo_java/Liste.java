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

import java.util.*;
public class Liste {
    //Creation de la liste
ArrayList<Integer> liste = new ArrayList<>();

//Lecture du nombre d'entiers
int n = 0;
System.out.println("Nombre d'entiers a saisir: ");
n = new Scanner(System.in).nextInt();

//Stockage des entier
int var = 0;
for(int i = 0; i < n; i++){
    System.out.print("Entier "+(i+1)+": ");
    var = new Scanner(System.in).nextInt();
    liste.add(var);
}

//Affichage de la liste avant son inversion
System.out.println("AVANT INVERSION");
System.out.print("- ");
for(int i = 0; i < liste.size(); i++){
    System.out.print(liste.get(i)+" - ");
}

//Inversion de la liste
int tmp = 0;
for(int i = 0; i < liste.size() /  2; i++){
tmp = liste.get(i);
liste.set(i, liste.get(liste.size()-i-1));
liste.set(liste.size()-i-1, tmp);
}

//Affichage après l'inversion
System.out.println("\nAPRES INVERSION");
System.out.print("- ");
for(int i = 0; i < liste.size(); i++){
    System.out.print(liste.get(i)+" - ");
}
}
