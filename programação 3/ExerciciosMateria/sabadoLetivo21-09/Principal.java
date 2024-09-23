
public class Principal {
    public static void main(String[] args) {
        PessoaFisica novaPessoaFisica = new PessoaFisica(
            01, 
            "01", 
            100, 
            123, 
            "Lucas"
        );

        PessoaJuridica novaPessoaJuridica = new PessoaJuridica(
            03, 
            "03", 
            2500, 
            321, 
            "Teste", 
            "Teste"
        );

        novaPessoaFisica.imprimirExtrato();
        novaPessoaJuridica.imprimirExtrato();

        // novaPessoaFisica.transferir(novaPessoaJuridica,50);

        // novaPessoaFisica.imprimirExtrato();
        // novaPessoaJuridica.imprimirExtrato();
    }
}
