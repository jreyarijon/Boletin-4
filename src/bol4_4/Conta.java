/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_4;

/**
 *
 * @author jreyarijon
 */
public class Conta {
    private String nome;
    private String nConta; 
    private double tipoInterese;
    private double saldo;
    
    public Conta(){
        
    }
    public Conta(String nome, String nC, double tInt, double sal){
        this.nome = nome;
        nConta = nC;
        tipoInterese = tInt;
        saldo = sal;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNConta(String nC){
        nConta = nC;
    }
    public String getNConta(){
        return nConta;
    }
    public void setTipoInterese(double tInt){
        tipoInterese = tInt;
    }
    public double getTipoInterese(){
        return tipoInterese;
    }
    public void setSaldo(double sal){
        saldo = sal;
    }
    public double getSaldo(){
        return saldo;
    }
    public void ingreso(int ingreso){
        saldo += ingreso;
    }
    public void reintegro(int reintegro){
        saldo -= reintegro;
    } 
    public void transferencia(Conta abanca, int importe){
        reintegro(importe);
        abanca.ingreso(importe);
       
    }
    
}

