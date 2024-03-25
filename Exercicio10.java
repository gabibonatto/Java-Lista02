import java.util.Scanner;

public class Exercicio10 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }

        System.out.println("Vetor B (cópia de A de forma invertida):");
        for (int num : vetorB) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
