import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        // Classifica a nota
        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 6) {
            System.out.println("Média");
        } else if (nota >= 5) {
            System.out.println("Ruim");
        }


    }
}
