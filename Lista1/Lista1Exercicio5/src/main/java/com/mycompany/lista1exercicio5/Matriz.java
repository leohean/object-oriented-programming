/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio5;

/**
 *
 * @author Leonardo
 */
public class Matriz {
    private int matriz[][];
    
    public Matriz(int matriz[][]){
        this.matriz=matriz;
    }
    
    public int[][] getMatriz(){
        return this.matriz;
    }
    
    public void setMatriz(int matriz[][]){
        this.matriz=matriz;
    }
    
    public int somaDiagonalSecudaria(){
        int soma=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if((i+j)==(matriz.length-1)){
                    soma+=matriz[i][j];
                }
            }
        }
        return soma;
    }
    
    public String calculaDiagonalSuperior(){
        String mRes="";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i<=j){
                    mRes=mRes+" "+String.valueOf(matriz[i][j])+" ";
                }else{
                    mRes=mRes+" 0 ";
                }
            }
            mRes=mRes+"\n";
        }
        return mRes;
    }
    
    public int multiplicaDiagonalPrincipal(){
        int mult=1;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==j){
                    mult*=matriz[i][j];
                }
            }
        }
        return mult;
    }
}
