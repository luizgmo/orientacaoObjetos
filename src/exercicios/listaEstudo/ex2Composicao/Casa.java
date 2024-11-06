package exercicios.listaEstudo.ex2Composicao;

public class Casa {
    private Comodo sala;
    private Comodo cozinha;
    private Comodo quarto;
    
    public Casa(){
        sala = new Comodo("sala");
        cozinha = new Comodo("cozinha");
        quarto = new Comodo("quarto");
    }
    
    public void listarComodos(){
        System.out.println(sala.getComodo());
        System.out.println(cozinha.getComodo());
        System.out.println(quarto.getComodo());
    }
}
