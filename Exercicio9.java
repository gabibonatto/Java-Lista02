import java.util.Scanner;

public class Exercicio9 {
    public static void executar () {
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
            vetorC[i * 2] = vetorA[i];
            vetorC[i * 2 + 1] = vetorB[i]; 
        }
        
        System.out.println("Vetor C (concatenação de A e B):");
        for (int num : vetorC) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
