package exercicios.listaEstudo.ex2Encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String n, double p, int q){
        nome = n;
        preco = p;
        quantidade = q;
    }
    
    public void setPreco(double p){
        preco = p;
    }
    
    public void setQuantidade(int q){
        quantidade = q;
    }
    
    private String getNome(){
        return nome;
    }
    
    private double getPreco(){
        return preco;
    }
    
    private int getQuantidade(){
        return quantidade;
    }
    
    public void exibirProduto(){
        System.out.println("Produto: " + getNome());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }
}
