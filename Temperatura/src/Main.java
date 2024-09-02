import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Muito Quente");
        } else if (temperatura >= 15) {
            System.out.println("Calor");
        } else if (temperatura >= 0) {
            System.out.println("Frio");
    }
    }
}