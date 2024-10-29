/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1exercicio3;

/**
 *
 * @author Leonardo
 */
public class Lista1Exercicio3 {

    public static void main(String[] args) {
        int[] vetor={0,1,0,0};
        Vetor v=new Vetor(vetor);
        
        System.out.println(v.toString());
        
        v.geraElementos();
        System.out.println(v.toString());
        
        System.out.println(v.soma());
        
        v.ordena();
        System.out.println(v.toString());
        
        System.out.println(v.maiorElemento());
    }
}
