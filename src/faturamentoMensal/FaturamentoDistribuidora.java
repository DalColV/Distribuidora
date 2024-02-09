package faturamentoMensal;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calculando o total mensal
        double totalMensal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calculando o percentual de representação de cada estado
        double percentualSP = (faturamentoSP / totalMensal) * 100;
        double percentualRJ = (faturamentoRJ / totalMensal) * 100;
        double percentualMG = (faturamentoMG / totalMensal) * 100;
        double percentualES = (faturamentoES / totalMensal) * 100;
        double percentualOutros = (faturamentoOutros / totalMensal) * 100;

        // Exibindo os resultados
        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + percentualSP + "%");
        System.out.println("RJ: " + percentualRJ + "%");
        System.out.println("MG: " + percentualMG + "%");
        System.out.println("ES: " + percentualES + "%");
        System.out.println("Outros: " + percentualOutros + "%");
}}
