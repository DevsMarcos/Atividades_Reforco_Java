public class CalculosDeImpostos {
    //Imposto de renda: 11%
    //quanto pagou ao INSS: 8%.
    //quanto pagou ao sindicato: 5%.

    public static double impostoDeRenda(double salarioBruto){
        return (salarioBruto * 0.11);
    }
    public static double INSS(double salarioBruto){
        return (salarioBruto * 0.08);
    }

    public static double sindicato(double salarioBruto){
        return (salarioBruto * 0.05);
    }


}
