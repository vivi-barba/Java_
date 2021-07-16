import java.util.Scanner;

public class exer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = sc.nextInt();

        if (n1 == 0)
            System.out.println("Seu numero é igual a zero");
        if (n1 >= 1)
            System.out.println("Seu numero é positivo");
        else {
            System.out.println("Seu numero é negativo");
        }
    }
}
