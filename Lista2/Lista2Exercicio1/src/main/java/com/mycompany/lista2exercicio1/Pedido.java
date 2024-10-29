/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio1;

/**
 *
 * @author Leonardo
 */
public class Pedido {
    private Veiculo veiculo;
    private Servico servico;
    
    public Pedido(Veiculo veiculo, Servico servico){
        this.veiculo=veiculo;
        this.servico=servico;
        cadastraPedido();
    }
    
    public Veiculo getSalario(){
        return this.veiculo;
    }
    
    public void setSalario(Veiculo veiculo){
        this.veiculo=veiculo;
    }
    
    public Servico getServico(){
        return this.servico;
    }
    
    public void setServico(Servico servico){
        this.servico=servico;
    }
    
    public void cadastraPedido(){
        Oficina.pedidos.add(this);
    }
}
