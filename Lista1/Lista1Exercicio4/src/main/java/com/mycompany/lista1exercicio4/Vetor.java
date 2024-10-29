/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio4;

/**
 *
 * @author Leonardo
 */
public class Vetor {
    private int[] vetorA=new int[10];
    
    Vetor(int[] vetorA){
        this.vetorA=vetorA;
    }
    
    public int[] getVetorA(){
        return this.vetorA;
    }
    
    public void setVetorA(int[] vetorA){
        this.vetorA=vetorA;
    }
    
    public int[] compacta(){
        int j=0;
        for(int i=0;i<vetorA.length;i++){   
            if(!(vetorA[i]<=0))
                j++;  
        }
        
        int[] vetorB=new int[j];
        int k=0;
        for(int l=0;l<vetorA.length;l++){   
            if(!(vetorA[l]<=0)){
                vetorB[k]=vetorA[l];
                k++;
            }
        }
        return vetorB;
    }
    
    public String toString(int[] vetor){
        String strVetor="";
        for(int i=0;i<vetor.length;i++){
            strVetor=strVetor.concat((String.valueOf(vetor[i]))+" ");  
        }
        return strVetor;
    }
}
