package exercicios.listaEstudo.ex3Agregacao;

public class Atleta {
    private String nome;
    private int idade;
    private double peso;
    private Treinamento treino;
    
    public Atleta(String n, int i, double p){
        nome = n;
        idade = i;
        peso = p;
    }
    
    public String getNomeAtleta(){
        return nome;
    }
    
    public int getIdadeAtleta(){
        return idade;
    }
    
    public double getPesoAtleta(){
        return peso;
    }
    
    public void setTreinamento(Treinamento t){
        treino = t;
    }
    
    public Treinamento getTreino(){
        return treino;
    }
    
    public void exibirInformacoes(){
        if (treino == null){
            System.out.println("O atleta não possui nenhum treino");
        } else{
            System.out.println(getNomeAtleta() + " treina " + treino.getNomeTreinamento());
        }
    }
}
