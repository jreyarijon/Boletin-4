/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_3;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Teclee radio =");
        double radio = sc.nextDouble();
        
        System.out.println("Área circulo ="+ c.calcularArea(radio));
        System.out.println("Perímetro círculo ="+c.calcularLonxitude(radio));
    }
    
}
