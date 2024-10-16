public class RelatorioImposto {
    public static void gerarRelatorio(ImpostoDeRenda impostoDeRenda) {
        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoDeRenda.impostoSalario());
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoDeRenda.impostoServico());
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoDeRenda.impostoGanhoCapital());
        System.out.println("* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", impostoDeRenda.calculoMaximoDedutivel());
        System.out.printf("Gastos dedutíveis: %.2f%n", impostoDeRenda.calculoGastosDedutiveis());
        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoDeRenda.impostoBrutoTotal());
        System.out.printf("Abatimento: %.2f%n", impostoDeRenda.abatimentoImposto());
        System.out.printf("Imposto devido: %.2f%n", impostoDeRenda.impostoDevido());
    }
}