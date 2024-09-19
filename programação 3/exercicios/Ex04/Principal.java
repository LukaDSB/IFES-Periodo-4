package Ex04;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        final float[] notas = {1.2f, 3.4f, 5.6f, 20f};
        Aluno novoAluno = new Aluno("Lucas", 31, notas);

        System.out.println("----- Dados do aluno -----\n\nNome: " + novoAluno.getNome() + 
        "\nMatricula: " + novoAluno.getMatricula() + 
        "\nNotas: " +  Arrays.toString(novoAluno.getNotas()) );

        var media = novoAluno.calcularMedias();
        System.out.println("\n\nMedia: " + media);
        System.out.println("\nSituação do aluno: " + novoAluno.situacaoAluno(media));
    }
}
