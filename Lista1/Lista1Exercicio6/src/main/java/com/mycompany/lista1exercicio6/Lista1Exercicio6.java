/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1exercicio6;

/**
 *
 * @author Leonardo
 */
public class Lista1Exercicio6 {

    public static void main(String[] args) {
        Matriz matriz=new Matriz(3);
        int [][] aux=matriz.getMatriz();
        
        for(int i=0;i<aux.length;i++){
            for(int j=0;j<aux.length;j++){
                System.out.print(aux[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        int[] vetorMaiorElemLinha=matriz.maiorElementoLinha();
        System.out.println("Os maiores elementos das linhas são: ");
        for(int i=0;i<vetorMaiorElemLinha.length;i++){
            System.out.print(vetorMaiorElemLinha[i]+" ");
        }
        
        System.out.print("\n\n");
        
        int[] vetorMenorElemColuna=matriz.menorElementoColuna();
        System.out.println("Os menores elementos das colunas são: ");
        for(int i=0;i<vetorMenorElemColuna.length;i++){
            System.out.print(vetorMenorElemColuna[i]+" ");
        }
    }
}
