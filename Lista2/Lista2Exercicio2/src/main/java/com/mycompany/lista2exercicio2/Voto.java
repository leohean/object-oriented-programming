/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Voto {
    static private ArrayList<Voto> listaDeVotos=new ArrayList<Voto>();
    private Eleitor eleitor;

    public Voto(Eleitor eleitor) {
        this.eleitor = eleitor;
        listaDeVotos.add(this);
    }

    public static ArrayList<Voto> getListaDeVotos() {
        return listaDeVotos;
    }

    public static void setListaDeVotos(ArrayList<Voto> listaDeVotos) {
        Voto.listaDeVotos = listaDeVotos;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }
    
    static public int numeroEntrevistados(){
        return listaDeVotos.size();
    }
    
    static public String intencaoVotosCadaCandidato(){
        int votosFulano=0, votosBeltrano=0, votosCiclano=0, votosNulos=0, votosBrancos=0;
        for(Voto lista:listaDeVotos){
            if(lista.getEleitor().getIntencaoVoto()=="Fulano da Silva"){
                votosFulano++;
            }else if(lista.getEleitor().getIntencaoVoto()=="Beltrano da Costa"){
                votosBeltrano++;
            }else if(lista.getEleitor().getIntencaoVoto()=="Ciclano do Amaral"){
                votosCiclano++;
            }else if(lista.getEleitor().getIntencaoVoto()=="Nulo"){
                votosNulos++;
            }else if(lista.getEleitor().getIntencaoVoto()=="Branco"){
                votosBrancos++;
            }
        }
        
        return "Fulano Da Silva(PSDB) - "+String.valueOf(votosFulano)+"\nBeltrano da Costa(PT) - "+String.valueOf(votosBeltrano)+"\nCiclano do Amaral(MDB) - "+String.valueOf(votosCiclano)+"\nNulo - "+String.valueOf(votosNulos)+"\nBranco - "+String.valueOf(votosBrancos);
    }
    
    static public String intencaoVotosEspecifica(){
        int votosFulano=0, votosBeltrano=0, votosCiclano=0, votosNulos=0, votosBrancos=0;
        for(Voto lista:listaDeVotos){
            if((lista.getEleitor().getEstadoCivil()=="Casado")&&(lista.getEleitor().getNumeroFilhos()>0)&&(lista.getEleitor().getRenda()<1500)){
                if(lista.getEleitor().getIntencaoVoto()=="Fulano da Silva"){
                    votosFulano++;
                }else if(lista.getEleitor().getIntencaoVoto()=="Beltrano da Costa"){
                    votosBeltrano++;
                }else if(lista.getEleitor().getIntencaoVoto()=="Ciclano do Amaral"){
                    votosCiclano++;
                }else if(lista.getEleitor().getIntencaoVoto()=="Nulo"){
                    votosNulos++;
                }else if(lista.getEleitor().getIntencaoVoto()=="Branco"){
                    votosBrancos++;
                }
            }
        }
        
        return "Fulano Da Silva(PSDB) - "+String.valueOf(votosFulano)+"\nBeltrano da Costa(PT) - "+String.valueOf(votosBeltrano)+"\nCiclano do Amaral(MDB) - "+String.valueOf(votosCiclano)+"\nNulo - "+String.valueOf(votosNulos)+"\nBranco - "+String.valueOf(votosBrancos);
    }
}
