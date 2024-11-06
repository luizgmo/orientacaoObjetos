package exercicios.listaEstudo.exComposicao;

public class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    
    public Biblioteca(){
        livro1 = new Livro("Harry Potter");
        livro2 = new Livro("Diario de um Banana");
        livro3 = new Livro("Dom Casmurro");
    }
    
    public void listarLivros(){
        System.out.println("Livro 1: " + livro1.getLivro());
        System.out.println("Livro 2: " + livro2.getLivro());
        System.out.println("Livro 3: " + livro3.getLivro()); 
    }
}
    
        

