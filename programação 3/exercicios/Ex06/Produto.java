package Ex06;

/*Implemente uma classe chamada Produto que possua 
atributos para armazenar o nome, o preço e a quantidade 
em estoque. Adicione métodos para calcular o valor total 
em estoque e verificar se o produto está disponível. */

public class Produto {
 private String nome;
 private float preco;
 private int qtdEstoque;
 
 public Produto(String nome, float preco){
    this.nome = nome;
    this.preco = preco;
 }

 public float valorEmEstoque(){
    return qtdEstoque * preco;
 }

 public String getNome(){
    return nome;
 }

 public float getPreco(){
    return preco;
 }

 public int getQtdEstoque(){
    return qtdEstoque;
 }

 public void setQtdEstoque(int quantidade){
    this.qtdEstoque = quantidade;
 }

}
