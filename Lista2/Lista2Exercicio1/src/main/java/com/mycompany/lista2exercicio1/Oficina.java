/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio1;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Oficina {
    static ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
    static Pedido pedido;
    
    static public ArrayList<String> realizaServico(){
        ArrayList<String> arrayResult=new ArrayList<String>();
        String result="";
        
        for(Pedido pedido:pedidos){
            if(pedido.getServico().getTrocaOleo()==true)
                result=result+"Troca de óleo realizada com sucesso\n";
            if(pedido.getServico().getTrocaPneu()==true)
                result=result+"Troca de pneu finalizada\n";
            if(pedido.getServico().getLimpaMotor()==true)
                result=result+"Motor limpo\n";
            
            arrayResult.add(result);
            result="";
        }
        return arrayResult;
    }
}
