package Ex04;

import java.util.Arrays;

/*Implemente uma classe chamada “Aluno” que possua atributos para armazenar o nome,
a matrícula e as notas de um aluno. Adicione métodos para calcular a média das notas
e verificar a situação do aluno (aprovado ou reprovado). */

public class Aluno {
    private String nome;
    private int matricula; 
    private float[] notas;

    public Aluno(String nome, int matricula, float[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public float calcularMedias(){
        float media = 0;

        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        return media/notas.length;
    }

    public String situacaoAluno(float media){
        return media > 6 ? "Aprovado" : "Reprovado";
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public float[] getNotas(){
        return notas;
    }
}