package br.senai.sp.jandira.vetores.model;

import java.util.Scanner;

public class Tabuada {

    int mutiplicando;
    int mutiplicadorInicial;
    int mutiplicadorFinal;
    String[] tabuada;



    public  void ObiterDados (){
        Scanner leitor = new Scanner(System.in);

        System.out.print("qual o multiplicador : ");
        mutiplicando = leitor.nextInt();
        System.out.print("qual é o multiplicador inicial: ");
        mutiplicadorInicial = leitor.nextInt();
        System.out.print("qual é o multiplicador final: ");
        mutiplicadorFinal = leitor.nextInt();
        Calculo();
    }

    public void Calculo(){
        int apoio = 0;
        if (mutiplicadorFinal < mutiplicadorInicial){
            apoio = mutiplicadorFinal;
            mutiplicadorFinal = mutiplicadorInicial;
            mutiplicadorInicial = apoio;

        }
        int tamanho = mutiplicadorFinal - mutiplicadorInicial + 1;
         tabuada = new String[tamanho];

         int i = 0;
        while (i < tamanho){
            int produto = mutiplicando * mutiplicadorInicial;
            tabuada[i] = mutiplicando + " X " + mutiplicadorInicial + " = " + produto;
            mutiplicadorFinal = mutiplicadorInicial + 1;
            i = i + 1;
         Exibirdados();
        }
    }

    public void Exibirdados(){
        System.out.println("Resultado da tabuada");
        int i = 0;
        while (i < tabuada.length){
            System.out.println(tabuada[i]);
            i++;
        }

    }

}
