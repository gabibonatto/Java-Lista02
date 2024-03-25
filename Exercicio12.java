import java.util.Scanner;

public class Exercicio12 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 12;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }

        System.out.println("Produto dos elementos pares positivos: " + produto);
        
        scanner.close();
    }
}
