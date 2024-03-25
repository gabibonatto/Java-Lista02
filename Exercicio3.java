import java.util.Scanner;

public class Exercicio3 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] numeros = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int[] dobros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            dobros[i] = numeros[i] * 2;
        }
        
        System.out.println("Valores do vetor dos dobros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + dobros[i]);
        }
        
        scanner.close();
    }
}
