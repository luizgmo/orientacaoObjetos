package exercicios.listaEstudo.ex3Encapsulamento;

public class Loja {
    private Produto produto;
    
    public Loja(){
        produto = new Produto("Panela", 50, 200);
    }
    
    public void comprarProduto(int q){
        produto.comprarProduto(q);
    }
    
    public void venderProduto(int q){
        produto.venderProduto(q);
    }
    
    public void exibirInformacoes(){
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
