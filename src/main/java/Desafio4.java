
//DESAFIO 4
public class Desafio4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;
        System.out.println("Faturamento total = R$ " + total);

        double percentualSp = sp / total * 100;
        double percentualRj = rj / total * 100;
        double percentualMg = mg / total * 100;
        double percentualEs = es / total * 100;
        double percentualOutros = outros / total * 100;

        System.out.println("Faturamento percentual de São Paulo = " + String.format("%.2f%%", percentualSp));
        System.out.println("Faturamento percentual do Rio de Janeiro = " + String.format("%.2f%%", percentualRj));
        System.out.println("Faturamento percentual de Minas Gerais = " +    String.format("%.2f%%", percentualMg));
        System.out.println("Faturamento percentual do Espirito Santo = " + String.format("%.2f%%", percentualEs));
        System.out.println("Faturamento percentual dos outros lugares = " + String.format("%.2f%%", percentualOutros));
    }
}
