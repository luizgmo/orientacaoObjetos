package exercicios.listaEstudo.ex2Encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Garrafa", 2, 50);
        
        produto1.exibirProduto();
        
        produto1.setPreco(3);
        produto1.exibirProduto();
        
        produto1.setQuantidade(100);
        produto1.exibirProduto();
        
    }
}
