package Ex02;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(01, "Lucas", 100);

        System.out.println("----- Situação atual da conta ----- \nNumero da conta:  " + conta.getNumConta() + "\nNome do Titular: " + conta.getNomeTitular() + "\nSaldo atual: " + conta.getSaldo());
        
        conta.realizarDeposito(10f);

        System.out.println("----- Situação atual da conta ----- \nNumero da conta:  " + conta.getNumConta() + "\nNome do Titular: " + conta.getNomeTitular() + "\nSaldo atual: " + conta.getSaldo());
    
        conta.realizarSaque(20f);

        System.out.println("----- Situação atual da conta ----- \nNumero da conta:  " + conta.getNumConta() + "\nNome do Titular: " + conta.getNomeTitular() + "\nSaldo atual: " + conta.getSaldo());
    }
}
