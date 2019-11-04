/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_3;

/**
 *
 * @author jreyarijon
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14;
    
public Circulo(){
    
}
public Circulo(double r){
    radio = r;
}
public double calcularArea(double rad){
    radio = rad;
    return PI*Math.pow(radio, 2);
}
public double calcularLonxitude(double rad){
    radio = rad;
    return 2*PI*radio;
}
    
}
