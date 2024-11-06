package exercicios.listaEstudo.ex2Agregacao;

public class Estudante {
    private String nome;
    private Curso curso;
    
    public Estudante(String s){
        nome = s;
    }
    
    public String getEstudante(){
        return nome;
    }
    
    public void setCurso(Curso c){
        curso = c;
    }
    
    public void exibirInformacoes(){
        if (curso == null){
            System.out.println(getEstudante() + " não está matriculado em nenhum curso");
        } else{
            System.out.println(getEstudante() + " está no curso " + curso.getCurso());
        }
    }
}
