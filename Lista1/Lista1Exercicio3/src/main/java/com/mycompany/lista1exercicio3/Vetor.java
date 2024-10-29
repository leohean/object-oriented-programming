/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio3;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class Vetor {
    private int[] vetor;
    
    Vetor(int[] vetor){
        this.vetor=vetor;
    }
    
    Vetor(){}
    
    public int[] getVetor(){
        return this.vetor;
    }
    
    public void setVetor(int[] vetor){
        this.vetor=vetor;
    }
    
    public void geraElementos(){
        int tamanho=0;
        
        if(vetor.length==0){
           tamanho=10;
        }else{
            tamanho=vetor.length;
        }
        
        Random random=new Random();
        for(int i=0;i<tamanho;i++){
            vetor[i]=random.nextInt(100);
        }
    }
    
    public int soma(){
        int soma=0;
        for(int i=0;i<vetor.length;i++){
            soma+=vetor[i];
        }
        
        return soma;
    }
    
    public void ordena(){
        for(int i=0;i<vetor.length;i++){
            for(int j=0;j<(vetor.length-1);j++){
                if(vetor[j]>vetor[j+1]){
                    int aux=vetor[j+1];
                    vetor[j+1]=vetor[j];
                    vetor[j]=aux;
                }
            }
        }
    }
    
    public int maiorElemento(){
        int maiorElemento=-1000;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]>maiorElemento){
                maiorElemento=vetor[i];
            }
        }
        return maiorElemento;
    }
    
    public String toString(){
        String strVetor="";
        for(int i=0;i<vetor.length;i++){
            strVetor=strVetor.concat(String.valueOf(vetor[i]));
            strVetor=strVetor.concat(" ");
        }
        
        return strVetor;
    }
}
