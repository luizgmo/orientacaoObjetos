package exercicios.listaEstudo.exAgregacao;

public class Aluno {
    private String nome;
    private Escola esc;
    
    public Aluno(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEscola(Escola e){
        esc = e;
    }
    
    public Escola getEscola(){
        return esc;
    }
    
    public void mostrarInfo(){
        if (esc == null){
            System.out.println(getNome() + " não está em nenhuma escola");
        } else{
            System.out.println(getNome() + " está na escola " + esc.getNome());
        }
    }
}
