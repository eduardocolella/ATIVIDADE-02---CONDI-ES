import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();
        double desconto;
        double valorDescontado;
        double valorFinal;

        if (valorCompra > 500) {
            desconto = 0.20;
        } else if (valorCompra >= 200) {
            desconto = 0.10;
        } else if (valorCompra >= 100) {
            desconto = 0.05;
        } else {
            desconto = 0.00;
        }

        valorDescontado = valorCompra * desconto;
        valorFinal = valorCompra - valorDescontado;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Percentual de desconto: " + (desconto * 100) + "%");
        System.out.println("Valor descontado: R$ " + valorDescontado);
        System.out.println("Valor final: R$ " + valorFinal);
    }


}