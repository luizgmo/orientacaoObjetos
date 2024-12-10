package aulas.polimorfismo.abstract_;

public class Assalariado extends Empregado{
    
    private double salario;

    public Assalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
        setSalario(salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }
    }

    @Override
    public double proventoSemanal() {
        return getSalario()/4;
    }
     
}