package questao3;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        List<Double> faturamento = new ArrayList<>();

        try {
            // Lê o arquivo JSON
            Scanner scanner = new Scanner(new FileReader("src/main/resources/dados.json"));
            StringBuilder jsonString = new StringBuilder();
            while (scanner.hasNext()) {
                jsonString.append(scanner.nextLine());
            }
            scanner.close();

            // Converte o JSON em um array
            JSONArray jsonArray = new JSONArray(jsonString.toString());

            // Adiciona os valores de faturamento à lista, ignorando os dias sem faturamento
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                double valor = obj.getDouble("valor");
                if (valor > 0) {
                    faturamento.add(valor);
                }
            }

            if (faturamento.isEmpty()) {
                System.out.println("Não há dados de faturamento para processar.");
                return;
            }

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double soma = 0;

            for (double valor : faturamento) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                soma += valor;
            }

            double mediaFaturamento = soma / faturamento.size();


            int diasAcimaDaMedia = 0;
            for (double valor : faturamento) {
                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
