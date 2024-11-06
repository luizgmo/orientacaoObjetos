package exercicios.listaEstudo.exEncapsulamento;

public class ContaBancaria {
    private int saldo;
    private String titular;
    
    public ContaBancaria(int s, String t){
        saldo = s;
        titular = t;
    }
    
    public void depositar(int s){
        saldo += s;
    }
    
    public void sacar(int s){
        if (s > saldo){
            System.out.println("Saldo insuficiente");
        } else{
            saldo -= s;
        }
    }
    
    private int getSaldo(){
        return saldo;
    }
    
    private String getTitular(){
        return titular;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
