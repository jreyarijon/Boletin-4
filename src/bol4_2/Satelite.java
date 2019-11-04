/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_2;

/**
 *
 * @author jreyarijon
 */
public class Satelite {
    private final double meridiano ;
    private final double paralelo;
    private final double distanciaTerra ;
    
     public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public Satelite (double m, double p, double d){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d ;

}
public void verPosicion ( ) {
    System.out.println("o satelite atopase  no meridiano :"+ meridiano + "paralelo :" + paralelo +" a unha distancia da terra :" + distanciaTerra);    
    }
}
