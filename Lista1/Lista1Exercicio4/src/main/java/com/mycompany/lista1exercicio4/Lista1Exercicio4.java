/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1exercicio4;

/**
 *
 * @author Leonardo
 */
public class Lista1Exercicio4 {

    public static void main(String[] args) {
        int[] array={-4,-3,-2,-1,0,1,2,3,4,5};
        Vetor vetor=new Vetor(array);
        System.out.println(vetor.toString(vetor.getVetorA()));
        
        int[] compressedArray=vetor.compacta();
        System.out.println(vetor.toString(compressedArray));
    }
}
