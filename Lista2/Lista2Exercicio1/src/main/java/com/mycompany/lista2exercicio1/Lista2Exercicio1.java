/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2exercicio1;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Lista2Exercicio1 {

    public static void main(String[] args) {
        Automovel automovel=new Automovel("Fusca",5);
        Caminhao caminhao=new Caminhao("Mercedes",3);
        
        Servico servico1=new Servico(true,false,true);
        Servico servico2=new Servico(false,true,false);
        
        Pedido pedido1=new Pedido(automovel, servico1);
        Pedido pedido2=new Pedido(caminhao, servico2);
        
        ArrayList<String> servicosRealizados=Oficina.realizaServico();
        
        for(String servico:servicosRealizados){
            System.out.println(servico);
        }
    }
}
