package exercicios.listaEstudo.ex2Agregacao;

public class Main {
    public static void main(String[] args) {
        Curso ads = new Curso("ADS");
        Curso medicina = new Curso("Medicina");
        
        Estudante e1 = new Estudante("Luiz");
        Estudante e2 = new Estudante("Pedro");
        Estudante e3 = new Estudante("Maria");
        Estudante e4 = new Estudante("João");
        
        e1.setCurso(ads);
        e2.setCurso(medicina);
        e3.setCurso(ads);
        
        e1.exibirInformacoes();
        e2.exibirInformacoes();
        e3.exibirInformacoes();
        e4.exibirInformacoes();
    }
}
