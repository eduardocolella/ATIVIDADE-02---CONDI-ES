import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Digite o número de anos de trabalho: ");
        int anosTrabalho = sc.nextInt();
        double bonus;
        double imposto;
        if (anosTrabalho > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalho >= 5) {
            bonus = salarioBruto * 0.05;
        } else {
            bonus = 0;
        }
        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18;
        } else {
            imposto = salarioBruto * 0.10;
        }
        double salarioLiquido = salarioBruto + bonus - imposto;
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);


    }
}