/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio1;

/**
 *
 * @author Leonardo
 */
public class Servico {
    private boolean trocaOleo;
    private boolean trocaPneu;
    private boolean limpaMotor;
    
    public Servico(boolean trocaOleo, boolean trocaPneu, boolean limpaMotor){
        this.trocaOleo=trocaOleo;
        this.trocaPneu=trocaPneu;
        this.limpaMotor=limpaMotor;
    }
    
    public boolean getTrocaOleo(){
        return this.trocaOleo;
    }
    
    public void setTrocaOleo(boolean trocaOleo){
        this.trocaOleo=trocaOleo;
    }
    
    public boolean getTrocaPneu(){
        return this.trocaPneu;
    }
    
    public void setTrocaPneu(boolean trocaPneu){
        this.trocaPneu=trocaPneu;
    }
    
    public boolean getLimpaMotor(){
        return this.limpaMotor;
    }
    
    public void setLimpaMotor(boolean limpaMotor){
        this.limpaMotor=limpaMotor;
    }
}
