package exercicios.listaEstudo.exMath;

public class Main {
    public static void main(String[] args) {
        int numero = (int)(Math.random() * 100) + 1;
        
        System.out.println("O número aleatorio é: " + numero);
        
        double quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado do número é: %.2f\n", quadrado);
        
        double raiz = Math.sqrt(numero);
        System.out.printf("A raiz do número é: %.2f\n", raiz);
        
        
    }
}
