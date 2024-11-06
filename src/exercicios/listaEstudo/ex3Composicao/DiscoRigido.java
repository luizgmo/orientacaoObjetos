package exercicios.listaEstudo.ex3Composicao;

public class DiscoRigido {
    private int capacidade;
    private String tipo;
    
    public DiscoRigido(int c, String t){
        capacidade = c;
        tipo = t;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public String getTipo(){
        return tipo;
    }
}
