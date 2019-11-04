/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_1;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c1 = new Coche();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Teclee aceleración: ");
        c1.acelerar(sc.nextInt());
        c1.frenar(sc.nextInt());
        
        
    }
}
