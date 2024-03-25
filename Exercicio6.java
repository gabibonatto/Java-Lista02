import java.util.Scanner;

public class Exercicio6 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o peso da " + (i+1) + "ª nota: ");
            pesos[i] = scanner.nextDouble();
        }

        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = soma / somaPesos;

        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
        
        scanner.close();
    }
}

