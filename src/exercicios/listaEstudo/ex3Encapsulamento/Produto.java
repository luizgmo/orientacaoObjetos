package exercicios.listaEstudo.ex3Encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String n, double p, int q){
        nome = n;
        preco = p;
        quantidade = q;
    }
    
    public void comprarProduto(int q){
        quantidade += q;
    }
    
    public void venderProduto(int q){
        if (q > quantidade){
            System.out.println("Quantidade insuficiente no estoque!");
        } else{
            quantidade -= q;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
}
