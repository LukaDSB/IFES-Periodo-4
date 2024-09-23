package Ex09;

/*Crie uma classe chamada “Paciente” que possua atributos para armazenar o nome, 
a idade e o histórico de consultas de um paciente. Implemente métodos para adicionar 
uma nova consulta ao histórico e exibir as consultas realizadas. */

public class Paciente {
    private String nome;
    private int idade;
    private Historico historico;
    
    
    public Paciente(String nome, int idade, Historico historico){
        this.nome = nome;
        this.idade = idade;
        this.historico = historico;
    }
}
