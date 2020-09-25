/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exo_java;

import java.util.Scanner;

/**
 *
 * @author DevGlee
 */
public class Moyenne {

    public static void main(String[] args) {

        System.out.println("Saisissez le nombre 1 ");
        float nb1 = new Scanner(System.in).nextInt();
        System.out.println("Saisissez le nombre 2");
        float nb2 = new Scanner(System.in).nextInt();

        float moy = (nb1 + nb2) / 2;

        System.out.println("La moyenne est de" + moy + "");

    }

}
