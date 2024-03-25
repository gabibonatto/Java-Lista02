import java.util.Scanner;

public class Exercicio2 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] numeros = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > 0) {
                System.out.println("Número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("Número na posição " + i + " é negativo.");
            } else {
                System.out.println("Número na posição " + i + " é zero.");
            }
        }
        
        scanner.close();
    }
}
