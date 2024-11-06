package exercicios.listaEstudo.exAgregacao;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("luiz");
        Aluno aluno2 = new Aluno("lucas");
        Aluno aluno3 = new Aluno("pedro");
        Aluno aluno4 = new Aluno("maria");
        
        Escola ifsp = new Escola("IFSP");
        Escola unesp = new Escola("UNESP");
        
        aluno1.setEscola(ifsp);
        aluno2.setEscola(unesp);
        aluno3.setEscola(unesp);
        
        aluno1.mostrarInfo();
        aluno3.mostrarInfo();
        aluno2.mostrarInfo();
        aluno4.mostrarInfo();
    }
}
