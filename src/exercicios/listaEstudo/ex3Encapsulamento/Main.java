package exercicios.listaEstudo.ex3Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        
        loja.exibirInformacoes();
        
        loja.comprarProduto(100);
        loja.exibirInformacoes();
        
        loja.venderProduto(500);
        loja.exibirInformacoes();
    }
}
