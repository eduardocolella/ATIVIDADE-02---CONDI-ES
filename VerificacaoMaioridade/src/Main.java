import java.util.Scanner;


 class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: "); {
            Integer idade = 0;
            idade = sc.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade");
            }
            else if (idade < 18) {
                System.out.println("Menor de idade");
            }

        }
    }
}
