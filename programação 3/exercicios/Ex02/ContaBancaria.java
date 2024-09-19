package Ex02;

/*Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta, 
nome do titular e saldo. Adicione métodos para realizar depósitos e saques.*/

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private float saldo;
    
    public ContaBancaria(int numConta, String nomeTitular, float saldo){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor){
        saldo = saldo + valor;
    }

    public void realizarSaque(float valor){
        saldo = saldo - valor;
    }

    public int getNumConta(){
        return numConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public float getSaldo(){
        return saldo;
    }

}
