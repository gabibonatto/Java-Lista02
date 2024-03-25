import java.util.Scanner;

public class Exercicio11 {
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

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetorB[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("Produto Escalar: " + produtoEscalar);
        
        scanner.close();
    }
}
