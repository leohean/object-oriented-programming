/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Curso {
    static ArrayList<Curso> lista=new ArrayList<Curso>();
    
    private String codigo;
    private int vagas;
    private int candidatosMasculinos;
    private int candidatosFemininos;
    
    Curso(String codigo, int vagas, int candidatosMasculinos, int candidatosFemininos){
        this.codigo=codigo;
        this.vagas=vagas;
        this.candidatosMasculinos=candidatosMasculinos;
        this.candidatosFemininos=candidatosFemininos;
        
        if(codigo=="")
            this.codigo="Código ainda não cadastrado";
        else
            this.codigo=codigo;
         
        if(vagas==0)
            this.vagas=0;
        else
            this.vagas=vagas;
              
        if(candidatosMasculinos==0)
            this.candidatosMasculinos=0;
        else
            this.candidatosMasculinos=candidatosMasculinos;
        
        if(candidatosFemininos==0)
            this.candidatosFemininos=0;
        else
            this.candidatosFemininos=candidatosFemininos;
        
        lista.add(this);
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(String codigo){
        if(codigo=="")
            this.codigo="Código ainda não cadastrado";
        else
            this.codigo=codigo;   
    }
    
    public int getVagas(){
        return this.vagas;
    }
    
    public void setVagas(int vagas){
        if(vagas==0)
            this.vagas=0;
        else
            this.vagas=vagas;
    }
    
    public int getCandidatosMasculinos(){
        return this.candidatosMasculinos;
    }
    
    public void setCandidatosMasculinos(){
        if(candidatosMasculinos==0)
            this.candidatosMasculinos=0;
        else
            this.candidatosMasculinos=candidatosMasculinos;
    }
    
    public int getCandidatosFemininos(){
        return this.candidatosFemininos;
    }
    
    public void setCandidatosFemininos(){
        if(candidatosFemininos==0)
            this.candidatosFemininos=0;
        else
            this.candidatosFemininos=candidatosFemininos;
    }
    
    static public String maiorConcorrencia(){
        Curso cursoMaiorConcorrencia = null;
        double maiorConcorrencia=-1;
        
        for(Curso curso:lista){
            double concorrencia=(curso.getCandidatosMasculinos()+curso.getCandidatosFemininos())/curso.getVagas();
            if(concorrencia>maiorConcorrencia){
                cursoMaiorConcorrencia=curso;
                maiorConcorrencia=concorrencia;
            }
        }
        
        return "O maior número de candidatos por vaga é "+maiorConcorrencia+" do curso de código "+cursoMaiorConcorrencia.getCodigo();
    }
    
}
