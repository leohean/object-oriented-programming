/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio6;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class Matriz {
    private int[][] matriz;
    private int ordem;
    
    public Matriz(int ordem){
        matriz=new int[ordem][ordem];
        Random random=new Random();
        for(int i=0;i<ordem;i++){
            for(int j=0;j<ordem;j++){
                this.matriz[i][j]=random.nextInt(101);
            }
        }
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }
    
    public void setMatriz(int[][] matriz){
        this.matriz=matriz;
    }
    
    public int getOrdem(){
        return this.ordem;
    }
    
    public void setOrdem(){
        this.ordem=ordem;
    }
    
    public int[] maiorElementoLinha(){
        int[] vetor=new int[this.matriz.length];
        
        for(int i=0;i<matriz.length;i++){
            int maiorElem=-1;
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]>maiorElem){
                    maiorElem=matriz[i][j];
                }
            }
            vetor[i]=maiorElem;
        }
        return vetor;
    }
    
    public int[] menorElementoColuna(){
        int[] vetor=new int[this.matriz.length];
        
        for(int i=0;i<matriz.length;i++){
            int menorElem=1000;
            for(int j=0;j<matriz.length;j++){
                if(matriz[j][i]<menorElem){
                    menorElem=matriz[j][i];
                }
            }
            vetor[i]=menorElem;
        }
        return vetor;
    }
    
}
