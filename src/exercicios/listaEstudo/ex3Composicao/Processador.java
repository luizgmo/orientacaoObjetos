package exercicios.listaEstudo.ex3Composicao;

public class Processador {
    private String modelo;
    private int numeroNucleos;
    
    public Processador(String m, int n){
        modelo = m;
        numeroNucleos = n;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getNucleos(){
        return numeroNucleos;
    }
    
}

