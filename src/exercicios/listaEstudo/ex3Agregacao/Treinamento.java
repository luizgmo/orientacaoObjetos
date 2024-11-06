package exercicios.listaEstudo.ex3Agregacao;

public class Treinamento {
    private String nome;
    private int duracao;
    private Treinador treinador;
    
    public Treinamento(String n, int d, Treinador t){
        nome = n;
        duracao = d;
        treinador = t;
    }
    
    public String getNomeTreinamento(){
        return nome;
    }
    
    public int getDuracaoTreinamento(){
        return duracao;
    }
    
    public Treinador getTreinador(){
        return treinador;
    }
    
    public void exibirInformacoesTreinamento(){
        System.out.println("Treino: " + getNomeTreinamento());
        System.out.println("Duracao: " + getDuracaoTreinamento());
        System.out.println("Treinador: " + treinador.getNomeTreinador());
    }
}
