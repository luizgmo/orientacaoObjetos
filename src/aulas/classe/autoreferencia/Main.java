package aulas.classe.autoreferencia;

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        p.setX(13.0);
        p.setY(13.0);
        
        p.imprimirA(5, 5);
        p.imprimirB(5, 5);
    }
}
