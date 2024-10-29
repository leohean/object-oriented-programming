/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2exercicio2;

/**
 *
 * @author Leonardo
 */
public class Lista2Exercicio2 {

    public static void main(String[] args) {
        Eleitor e1=new Eleitor("Leandro","Rua 1",1,"Bairro 1","Cidade 1","11111111","SP",0,"01/01/2001","Casado",2000.0,"Ciclano do Amaral");
        Eleitor e2=new Eleitor("Leonardo","Rua 2",2,"Bairro 2","Cidade 2","22222222","SP",8,"02/02/2002","Solteiro",0.0,"Fulano da Silva");
        Eleitor e3=new Eleitor("Guilherme","Rua 3",3,"Bairro 3","Cidade 3","33333333","SP",0,"03/03/2003","Casado",4000.0,"Beltrano da Costa");
        Eleitor e4=new Eleitor("Vitor","Rua 4",4,"Bairro 4","Cidade 4","44444444","SP",4,"04/04/2004","Solteiro",2000.0,"Nulo");
        Eleitor e5=new Eleitor("Thiago","Rua 5",5,"Bairro 5","Cidade 5","55555555","SP",1,"05/05/2005","Casado",1499.0,"Nulo");
        Eleitor e6=new Eleitor("Eugênio","Rua 6",6,"Bairro 6","Cidade 6","66666666","SP",0,"06/06/2006","Viúvo",500.0,"Branco");
        Eleitor e7=new Eleitor("Angelo","Rua 7",7,"Bairro 7","Cidade 7","77777777","SP",2,"07/07/2007","Casado",10000.0,"Beltrano da Costa");
        Eleitor e8=new Eleitor("Matheus","Rua 8",8,"Bairro 8","Cidade 8","88888888","SP",0,"08/08/2008","Viúvo",16000.0,"Branco");
        
        e1.votar();
        e2.votar();
        e3.votar();
        e4.votar();
        e5.votar();
        e6.votar();
        e7.votar();
        e8.votar();
        
        System.out.println("Votos para cada candidato:\n"+Voto.intencaoVotosCadaCandidato());
        System.out.println("\n---------------------------------------------------------------------------------------------------\n");
        System.out.println("Votos para cada candidato do grupo de pessoas casadas, com filhos e com renda inferior a R$1500.00:\n"+Voto.intencaoVotosEspecifica());
        
    }
}
