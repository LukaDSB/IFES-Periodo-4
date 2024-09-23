public class Cliente {
    private int numeroConta;
    private String agencia;
    private float saldo;
    private float limite;

    public Cliente(int numeroConta, String agencia, float saldo, float limite){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        setLimite(limite);
        setSaldo(saldo);
    }

    public float sacar(float valor){
        saldo -= valor;
        return valor;
    }

    public void depositar(float valor){
        if( (saldo + valor) > limite){
            throw new IllegalArgumentException("Erro: O saldo da conta não pode ultrapassar o limite de R$" + getLimite());
        }
        saldo += valor;
    }

    public boolean transferir(Cliente cliente, float valor){
        if(saldo - valor < 0){
            throw new IllegalArgumentException("\nErro: Saldo insuficiente para realizar transação.\nVocê possui: "+ saldo);
        }
        saldo -= valor;

        if(cliente.saldo + valor > cliente.getLimite()){
            throw new IllegalArgumentException("Erro: O saldo não pode exceder o limite de " + cliente.getLimite() + ".");
        }
        cliente.saldo += valor;
        return true;
    }

    public void imprimirExtrato(){
        System.out.println(
            "\nNº conta: " + getNumeroConta() + 
            "\nAgencia: " + getAgencia() + 
            "\nSaldo: " + getSaldo() + 
            "\nLimite: " + getLimite()
        );
    }

    public void setSaldo(float saldo) {
        if (saldo > limite) {
            throw new IllegalArgumentException("Erro: O saldo não pode exceder o limite de " + getLimite() + ".");
        }
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public float getSaldo(){
        return saldo;
    }

    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

}