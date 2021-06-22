import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");

        int n1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");

        int n2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");

        int n3 = sc.nextInt();

        if (n1 > n2)
            System.out.println("seu primeiro numero é maior que o segundo");
        if (n1 > n3)
            System.out.println("seu primeiro numero é maior que o terceiro");
        if (n2 > n1)
            System.out.println("seu segundo numero é maior que o primeiro");
        if (n2 > n3)
            System.out.println("seu segundo numero é maior que o terceiro");
        if (n3 > n1)
            System.out.println("Seu terceiro numero é maior que o primeiro");
        if (n3 > n2)
            System.out.println("Seu terceiro numero é maior que o segundo");

    }
}
