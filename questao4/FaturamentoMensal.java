package questao4;

public class FaturamentoMensal {
    public static void main(String[] args) {
        // Faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        System.out.println("Percentual de representação de cada estado: \n");

        double percentualSP = (sp / totalFaturamento) * 100;
        System.out.printf("SP: %.2f%%\n", percentualSP);

        double percentualRJ = (rj / totalFaturamento) * 100;
        System.out.printf("RJ: %.2f%%\n", percentualRJ);

        double percentualMG = (mg / totalFaturamento) * 100;
        System.out.printf("MG: %.2f%%\n", percentualMG);

        double percentualES = (es / totalFaturamento) * 100;
        System.out.printf("ES: %.2f%%\n", percentualES);

        double percentualOutros = (outros / totalFaturamento) * 100;
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}

