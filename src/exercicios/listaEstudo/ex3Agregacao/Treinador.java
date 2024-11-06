package exercicios.listaEstudo.ex3Agregacao;

public class Treinador {
    private String nome;
    private String especialidade;
    private Treinamento treino;
    
    public Treinador(String n, String e){
        nome = n;
        especialidade = e;
    }
    
    public String getNomeTreinador(){
        return nome;
    }
    
    public String getEspecialidadeTreinador(){
        return especialidade;
    }
    
    public void setTreinamento(Treinamento t){
        treino = t;
    }
}
