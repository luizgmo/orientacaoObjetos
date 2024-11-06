package exercicios.listaEstudo.exReferencia;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("luiz");
        Pessoa pessoa2 = pessoa1;
        
        System.out.println("Pessoa 1: " + pessoa1.getNome());
        System.out.println("Pessoa 2: " + pessoa2.getNome());
        
        pessoa1.setNome("joao");
        
        System.out.println("Pessoa 1: " + pessoa1.getNome());
        System.out.println("Pessoa 2: " + pessoa2.getNome());
        
        pessoa2.setNome("luiz");
        
        System.out.println("Pessoa 1: " + pessoa1.getNome());
        System.out.println("Pessoa 2: " + pessoa2.getNome());
        
        // ambas pessoas mudam de valor pois apontam para o mesmo objeto
        
    }
}
