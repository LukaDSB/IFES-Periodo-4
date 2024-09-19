package Ex05;

public class Funcionario {
    private String nome;
    private float salario;
    private String cargo;

    public Funcionario(String nome, float salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public float calcularSalario(){
        float descontos = 10f;
        return salario = salario - descontos;
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }
}
