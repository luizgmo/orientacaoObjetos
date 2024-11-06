package exercicios.listaEstudo.ex3Composicao;

public class Computador {
    private Processador processador;
    private MemoriaRAM memoriaRam;
    private DiscoRigido discoRigido;
    
    public Computador(){
        processador = new Processador("i9", 16);
        memoriaRam = new MemoriaRAM(16);
        discoRigido = new DiscoRigido(512, "SSD");
    }
    
    public void exibirEspecificacoes(){
        System.out.println("Processador: " + processador.getModelo());
        System.out.println("Nucleos Processador: " + processador.getNucleos());
        System.out.println("Memoria RAM: " + memoriaRam.getMemoriaRam() + "GB");
        System.out.println("Disco Rigido: " + discoRigido.getTipo() + " com " + discoRigido.getCapacidade() + "GB");
    }
}
