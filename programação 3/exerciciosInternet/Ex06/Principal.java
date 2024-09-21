package Ex06;

public class Principal {
    public static void main(String[] args) {

        Produto novoProduto = new Produto("Arroz", 21);
        novoProduto.setQtdEstoque(Integer.parseInt(args[0]));

        System.out.println("\nPreco do produto: " + novoProduto.getPreco());
        System.out.println("\nQuantidade do produto em estoque: " + novoProduto.getQtdEstoque());
        System.out.println("\nValor total em estoque: " + novoProduto.valorEmEstoque());
    }

}
