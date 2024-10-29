/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio1;

/**
 *
 * @author Leonardo
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private double salario;
    
    Pessoa(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        
        if(salario<0)
            this.salario=0;
        else
            this.salario=salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
    
    public double calculaImposto(){
        double imposto=this.salario;
        if(this.salario<1500)
            imposto*=0;
        else if((1500<this.salario)&&(this.salario<=2000))
            imposto*=0.075;
        else if((2000<this.salario)&&(this.salario<=3000))
            imposto*=0.15;
        else if((3000<this.salario)&&(this.salario<=4000))
            imposto*=0.225;
        else if(4000<this.salario)
            imposto*=0.275;
        
        return imposto;   
    }
    
    @Override
    public String toString(){
        return "Salário: "+getSalario()+" - Imposto à pagar: "+calculaImposto()+" - Salário sem o imposto: "+(this.salario-calculaImposto());
    }
}
