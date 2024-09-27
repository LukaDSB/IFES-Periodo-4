public class PessoaFisica extends Cliente{
    private int cpf;
    private String nome;

    public PessoaFisica(
        int numeroConta, 
        String agencia, 
        float saldo, 
        int cpf, 
        String nome
        ) {

        super(
            numeroConta, 
            agencia, 
            saldo, 
            1000
        );

        if (saldo > 1000) {
            throw new IllegalArgumentException("Erro: O saldo para pessoa física não pode exceder o limite de R$1000.");
        }

        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }
    

    @Override
    public void imprimirExtrato(){
        System.out.println(
            "\nNumero da conta: " + super.getNumeroConta()
            + "\nAgencia: " + super.getAgencia()
            + "\nSaldo: " + super.getSaldo()
            + "\nLimite: " + super.getLimite()
            + "\nCpf: "+ cpf 
            + "\nNome: " + nome
        );
    }
}
