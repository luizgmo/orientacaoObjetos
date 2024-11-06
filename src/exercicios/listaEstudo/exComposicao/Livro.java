package exercicios.listaEstudo.exComposicao;

public class Livro {
    private String nome;
    
    public Livro(String n){
        setNome(n);
    }
    
    private void setNome(String n){
        nome = n;
    }
    
    public String getLivro(){
        return nome;
    }
}
