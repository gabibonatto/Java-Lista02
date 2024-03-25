import java.util.Scanner;

public class Exercicio8 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + tamanho] = vetorB[i];
        }

        System.out.println("O vetor C (concatenação de A e B) é:");
        for (int i = 0; i < tamanho * 2; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
