package exercicios.listaEstudo.ex3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.getSaldo();
        
        conta1.depositarSaldo(1000);
        
        conta1.getSaldo();
        
        conta1.sacarSaldo(100);
        
        conta1.getSaldo();
    }
}
