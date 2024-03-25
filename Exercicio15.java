import java.util.Scanner;

public class Exercicio15 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite 5 números:");
        vetor[0] = scanner.nextInt(); 
        
        for (int i = 1; i < tamanho; i++) {
            int numero = scanner.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero; 
            } else {
                System.out.println("O número digitado não é maior que o anterior. Digite um número maior.");
                i--; 
            }
        }

        System.out.println("Vetor preenchido:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
