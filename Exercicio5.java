import java.util.Scanner;

public class Exercicio5 {
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

        int quantidade = 0;
        for (int num : numeros) {
            if (num == n) {
                quantidade++;
            }
        }

        System.out.println("O número " + n + " aparece " + quantidade + " vezes no vetor.");
        
        scanner.close();
    }
}
