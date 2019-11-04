/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_4;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc = new Scanner(System.in);
        Conta ing = new Conta();
        ing.setNome(sc.nextLine());
        ing.setNConta(sc.nextLine());
        ing.setTipoInterese(sc.nextFloat());
        ing.setSaldo(sc.nextInt());
        System.out.println("DATOS DA CONTA BANCARIA: "+"\nNome: "+ ing.getNome()+"\tNúmero da conta: "+ ing.getNConta()+"\nTipo de interese :"+ ing.getTipoInterese()+"\tSaldo inicial: "+ ing.getSaldo()+"€");
        System.out.println("Teclee cantidade a ingresar: ");
        int saldI = sc.nextInt();
        
        System.out.println("Saldo total despois do ingreso"+ (ing.getSaldo()+saldI)+"€");
        
        System.out.println("Teclee cantidade a reintegrar: ");
        int saldR = sc.nextInt();
        
            if (saldR>=2500)
            System.out.println("Saldo máximo despois do reintegro: "+ 0+"€");
            else
            System.out.println("Saldo máximo despois do reintegro: "+ (ing.getSaldo()-saldR)+"€");
           
        Conta aBanca = new Conta();
        aBanca.setNome(sc.nextLine());
        aBanca.setNConta(sc.nextLine());
        aBanca.setTipoInterese(sc.nextFloat());
        aBanca.setSaldo(sc.nextInt());
       
        System.out.println("Teclee importe para transferir: ");
        int importe = sc.nextInt();
        ing.transferencia(aBanca, importe);
        
    }
       
    
}
