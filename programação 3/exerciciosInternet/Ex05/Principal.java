package Ex05;

public class Principal {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario("Lucas", 1000, "Desenvolvedor");

        System.out.println("----- Informacoes do Funcionario -----\n\nNome: " + novoFuncionario.getNome() + 
        "\nSalario: " + novoFuncionario.getSalario() + 
        "\nCargo: " + novoFuncionario.getCargo());

        System.out.println("\n\nSalario apos o desconto: " + novoFuncionario.calcularSalario());
    }
}
