package exercicios.listaEstudo.exEncapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000, "luiz");
        
        conta1.exibirInformacoes();
        
        conta1.depositar(1000);
        conta1.exibirInformacoes();
        
        conta1.sacar(1000);
        conta1.exibirInformacoes();
        
        conta1.sacar(2000);
        conta1.exibirInformacoes();
    }
}
