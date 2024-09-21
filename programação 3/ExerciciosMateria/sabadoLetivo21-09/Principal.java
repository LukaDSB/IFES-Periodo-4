
public class Principal {
    public static void main(String[] args) {
        PessoaFisica novaPessoaFisica = new PessoaFisica(
            01, 
            "01", 
            1000, 
            123, 
            "Lucas"
        );

        PessoaJuridica novaPessoaJuridica = new PessoaJuridica(
            03, 
            "03", 
            4900, 
            321, 
            "Teste", 
            "Teste"
        );

        novaPessoaFisica.imprimirExtrato();
        novaPessoaJuridica.imprimirExtrato();

        novaPessoaFisica.transferir(novaPessoaJuridica,500);

        novaPessoaFisica.imprimirExtrato();
        novaPessoaJuridica.imprimirExtrato();
    }
}
