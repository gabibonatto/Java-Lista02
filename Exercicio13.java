import java.util.Scanner;

public class Exercicio13 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido. Por favor, insira um número maior que zero.");
        }

        int primeiro = 1;
        int segundo = 1;
        
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        System.out.print(primeiro + " " + segundo + " ");
        
        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println();
        
        scanner.close();
    }
}
