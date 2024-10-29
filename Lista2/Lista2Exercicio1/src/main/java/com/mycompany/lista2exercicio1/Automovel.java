/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio1;

/**
 *
 * @author Leonardo
 */
public class Automovel extends Veiculo{
    private int numPassageiros;
    
    public Automovel(String nome, int numPassageiros){
        super(nome);
        this.numPassageiros=numPassageiros;
    }
    
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros=numPassageiros;
    }
}
