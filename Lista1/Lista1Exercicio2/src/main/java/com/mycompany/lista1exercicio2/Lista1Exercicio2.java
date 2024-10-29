/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1exercicio2;

/**
 *
 * @author Leonardo
 */
public class Lista1Exercicio2 {

    public static void main(String[] args) {
        Curso c1=new Curso("1",10,500,450);
        Curso c2=new Curso("2",40,25,15);
        Curso c3=new Curso("3",30,10,20);
        
        System.out.println(Curso.maiorConcorrencia());
    }
}
