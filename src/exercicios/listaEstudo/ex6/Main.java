package exercicios.listaEstudo.ex6;

import exercicios.listaEstudo.ex5.ConversaoDeUnidadesDeVolume;

public class Main {
    public static void main(String[] args) {
        
        double litro;
        double pes;
        double cm;
        
        ConversaoDeUnidadesDeVolume piscina = new ConversaoDeUnidadesDeVolume();
        
        litro = piscina.converterMetroL(1890);
        
        pes = piscina.converterMetroPes(1890);
        
        cm = piscina.converterLitroCm(litro);
        
        System.out.println(litro + " Litros / " + pes + " Pés / " + cm + " Centímetros Cúbicos");
        
        
    }
}
