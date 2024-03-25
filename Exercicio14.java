import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetor[i] = scanner.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int temp = vetor[tamanho - 1];
        vetor[tamanho - 1] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        System.out.println("Vetor atualizado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
