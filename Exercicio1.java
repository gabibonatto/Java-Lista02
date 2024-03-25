import java.util.Scanner;

public class Exercicio1{
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        
        System.out.println("Média dos números: " + media);
        
        for (int num : numeros) {
            if (num < media) {
                System.out.println(num + " é menor que a média");
            } else if (num == media) {
                System.out.println(num + " é igual à média");
            } else {
                System.out.println(num + " é maior que a média");
            }
        }
        
        scanner.close();
    }
}
