import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else if (numero % 3 != 0) {
            System.out.println("O número é ímpar.");
    }
    }
}