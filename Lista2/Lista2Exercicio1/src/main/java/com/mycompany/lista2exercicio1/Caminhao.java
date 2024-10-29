/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio1;

/**
 *
 * @author Leonardo
 */
public class Caminhao extends Veiculo{
    private int numEixos;
    
    public Caminhao(String nome, int numEixos){
        super(nome);
        this.numEixos=numEixos;
    }
    
    public int getNumEixos(){
        return this.numEixos;
    }
    
    public void setNumEixos(int numEixos){
        this.numEixos=numEixos;
    }
}
