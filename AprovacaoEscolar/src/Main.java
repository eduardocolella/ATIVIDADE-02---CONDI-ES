import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = sc.nextDouble();


        if (media >= 60) {
            System.out.println("Aprovado");
        } else if (media >= 50) {
            System.out.println("Recuperação");
        } else if (media <= 49) {
            System.out.println("Reprovado");
        }
    }
}