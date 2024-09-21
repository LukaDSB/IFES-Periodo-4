public class PessoaJuridica extends Cliente {

    private int cnpj;
    private String razaoSocial;
    private String naturezaJuridica;

    public PessoaJuridica(
        int numeroConta, 
        String agencia, 
        float saldo, 
        int cnpj, 
        String razaoSocial,
        String naturezaJuridica
        ){

        super(
            numeroConta, 
            agencia, 
            saldo, 
            5000
        );

        if (saldo > 5000) {
            throw new IllegalArgumentException("Erro: O saldo para pessoa jurídica não pode exceder o limite de R$5000.");
        }

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.naturezaJuridica = naturezaJuridica;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    @Override
    public void imprimirExtrato(){
        super.imprimirExtrato();
        System.out.println(
            "Cnpj: " + cnpj 
            + "\nRazao Social: " + razaoSocial 
            + "\nNatureza Juridica: " + naturezaJuridica
        );
    }
}
