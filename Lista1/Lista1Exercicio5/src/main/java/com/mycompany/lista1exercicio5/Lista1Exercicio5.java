/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1exercicio5;

/**
 *
 * @author Leonardo
 */
public class Lista1Exercicio5 {

    public static void main(String[] args) {
        int mExem[][]={{1,1,1},{2,4,2},{3,3,3}};
        
        Matriz matriz=new Matriz(mExem);
        
        System.out.println("A soma da diagonal secundária é "+matriz.somaDiagonalSecudaria());
        
        System.out.println("\nA diagonal superior da matriz é :\n"+matriz.calculaDiagonalSuperior());
        
        System.out.println("A multiplicação da diagonal principal é "+matriz.multiplicaDiagonalPrincipal());
    }
}
