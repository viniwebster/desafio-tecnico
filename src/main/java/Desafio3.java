import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Desafio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode;

        List<Double> list = new ArrayList<>();
        try {
            jsonNode = objectMapper.readValue(new File("src/main/java/dados.json"), JsonNode.class);
            for (JsonNode node : jsonNode) {
                double valor = node.get("valor").asDouble();
                list.add(valor);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double total = list.stream().reduce(0.0, Double::sum);
        double maiorFaturamento = list.stream().max(Comparator.comparing(x -> x)).get();
        double menorFaturamento = list.stream().min(Comparator.comparing(x -> x)).get();

        double media = total / list.size();
        int dias = 0;
        for (Double valorDiario : list) {
            if (valorDiario > media) {
                dias++;
            }
        }

        System.out.println("O faturamento total foi de: " + String.format("%.2f", total));
        System.out.println("A média de faturamento foi de: " + String.format("%.2f", media));
        System.out.println("O maior faturamento foi de: " + String.format("%.2f", maiorFaturamento));
        System.out.println("O menor faturamento foi de: " + String.format("%.2f", menorFaturamento));
        System.out.println("Numero de dias que superaram a média do faturamento diário: " + dias);
    }
}
