package aulas.classe.basico;

public class Pessoa {
    
    // atributos
    public double altura;
    public char sexo;
    public double pesoIdeal;
    
    // métodos (operações)
    public void calcularPesoIdeal(){
        
        if ((sexo == 'F') || (sexo == 'f')){
            
            pesoIdeal = 62.1 * altura - 44.7;
            
        } else{
            if ((sexo == 'M') || (sexo == 'm')){
                pesoIdeal = 72.7 * altura - 52;
        }
        
    }
    
}
