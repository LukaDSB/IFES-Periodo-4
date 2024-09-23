package Ex08;

public class Principal {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("fodase","caguei" , 60);
        System.out.println("Velocidade atual: " + novoCarro.getVelocidade());
        novoCarro.acelerar(10);
        System.out.println("Velocidade após acelerar: " + novoCarro.getVelocidade());
        novoCarro.frear(20);
        System.out.println("Velocidade após frear: " + novoCarro.getVelocidade());
    }
}
