/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio2;

/**
 *
 * @author Leonardo
 */
public class Eleitor {
    private String nome;
    private Endereco endereco;
    private int numeroFilhos;
    private String dataNascimento;
    private String estadoCivil;
    private double renda;
    private String intencaoVoto;

    public Eleitor(String nome, String rua, int numero, String bairro, String cidade, String cep, String estado, int numeroFilhos, String dataNascimento, String estadoCivil, double renda, String intencaoVoto) {
        this.nome = nome;
        this.endereco = endereco;
        
        Endereco endereco=new Endereco(rua, numero, bairro, cidade, cep, estado);
        this.endereco=endereco;
        
        this.numeroFilhos = numeroFilhos;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.renda=renda;
        this.intencaoVoto=intencaoVoto;;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String getIntencaoVoto() {
        return intencaoVoto;
    }

    public void setIntencaoVoto(String intencaoVoto) {
        this.intencaoVoto = intencaoVoto;
    }
    
    public void votar(){
        Voto voto=new Voto(this);
    }
    
    
    
}
