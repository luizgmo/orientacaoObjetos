package exercicios.listaEstudo.ex3;

public class ContaCorrente {
    private double saldo;
    
    public ContaCorrente(){
        saldo = 0;
    }
    
    public void depositarSaldo(double s){
        saldo += s;
    }
    
    public void sacarSaldo(double s){
        saldo -= s + s * 0.005;
    }
    
    public void getSaldo(){
        System.out.println("Saldo da conta: " + saldo + "R$");
    }
}
