/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introjava;

/**
 *
 * @author DevGlee
 */
import java.util.Scanner;

public class Moyenne {
     public static void main (String [] args) {
        
        float nb1 = new Scanner(System.in).nextInt();
        float nb2 = new Scanner(System.in).nextInt();
        System.out.println("Saisissez le nombre 1 et le nombre 2");
        float moy = nb1/nb2;
        
        System.out.println("La moyenne est de"+moy+"");
        
        
    }
}
