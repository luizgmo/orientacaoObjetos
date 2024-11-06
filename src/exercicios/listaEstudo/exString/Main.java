package exercicios.listaEstudo.exString;

public class Main {
    public static void main(String[] args) {
        String nome = "Luiz";
        
        String nomeMinusc = nome.toLowerCase();
        System.out.println(nomeMinusc);
        
        String nomeMaiusc = nome.toUpperCase();
        System.out.println(nomeMaiusc);
        
        int tamanho = nome.length();
        System.out.println(tamanho);
        
        System.out.println(nome.startsWith("lu"));
        System.out.println(nome.startsWith("Lu"));
        
        System.out.println(nome.concat(nomeMaiusc));
        
    }
}
