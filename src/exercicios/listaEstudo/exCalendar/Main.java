package exercicios.listaEstudo.exCalendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int ano = calendario.get(Calendar.YEAR);
        
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
        
        int novoDia = dia + 10;
        System.out.println("Dia: " + novoDia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
        
        novoDia = dia - 5;
        System.out.println("Dia: " + novoDia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
        
    }
}
