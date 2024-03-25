import java.util.Scanner;

public class Exercicio4 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 5;

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        System.out.println("Elementos inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < n) {
                System.out.println("Índice " + i + ": " + numeros[i]);
            }
        }
        
        scanner.close();
    }
}
