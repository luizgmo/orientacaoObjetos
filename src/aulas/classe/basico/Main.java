package aulas.classe.basico;


public class Main {
    public static void main(String[] args) {
        
        Pessoa usuario;
        usuario = new Pessoa();
        
        System.out.println(usuario.altura);
        System.out.println(usuario.sexo);
        System.out.println(usuario.pesoIdeal);
        
        usuario.altura = 1.80;
        usuario.sexo = 'M';
        
        usuario.calcularPesoIdeal();
        System.out.println(usuario.pesoIdeal);
        
    }
}