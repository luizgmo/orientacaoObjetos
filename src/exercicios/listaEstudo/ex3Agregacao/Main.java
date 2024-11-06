package exercicios.listaEstudo.ex3Agregacao;

public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("Luiz", 19, 80);
        Atleta a2 = new Atleta("Pedro", 18, 70);
        
        Treinador t1 = new Treinador("Marco", "Musculacao");
        
        Treinamento musculacao = new Treinamento("Musculacao", 100, t1);
        
        a1.exibirInformacoes();
        a2.exibirInformacoes();
        
        a1.setTreinamento(musculacao);
        a1.exibirInformacoes();
        a2.exibirInformacoes();
        
        a2.setTreinamento(musculacao);
        a1.exibirInformacoes();
        a2.exibirInformacoes();
        
        musculacao.exibirInformacoesTreinamento();
        
    }
}
