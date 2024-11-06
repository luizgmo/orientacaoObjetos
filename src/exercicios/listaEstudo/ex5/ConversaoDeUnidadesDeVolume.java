package exercicios.listaEstudo.ex5;

public class ConversaoDeUnidadesDeVolume {
    private double litro;
    private double metroC;
    private double galao;
    private double cmC;
    private double pes;
    private double pol;
    
    public double converterLitroCm(double l){
        litro = l;
        cmC = litro * 1000;
        return cmC;
    }
    
    public double converterMetroL(double m){
        metroC = m;
        litro = metroC * 1000;
        return litro;
    }
    
    public double converterMetroPes(double m){
        metroC = m;
        pes = metroC * 35.32;
        return pes;
    }
    
    public double converterGalaoPol(double g){
        galao = g;
        pol = galao * 231;
        return pol;
    }
    
    public double converterGalaoL(double g){
        galao = g;
        litro = galao * 3.785;
        return litro;
    }
}
