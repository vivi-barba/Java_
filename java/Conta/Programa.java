package Conta;
import java.util.*;

public class Programa {
    public static void main(String[] args)
    {
        //Informações:
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja muito bem vindo ao banco do PROA!\nPor favor, insira suas informações.\nTitular:");
        String titular = sc.nextLine();
        System.out.println("Data de abertura:");
        String abertura = sc.nextLine();
        System.out.println("Número da conta:");
        int numero = sc.nextInt();
        System.out.println("Agência:");
        int agencia = sc.nextInt();
        System.out.println("Saldo:");
        Double saldo = sc.nextDouble();
        int R = 2;
       
        //Conta salva:
        Conta conta = new Conta(titular, numero, agencia, saldo, abertura);

        while ( R > 1 )
        {
        //Funções:
        System.out.println("O que você deseja fazer ?\n1.) Ver saldo\n2.) Sacar\n3.) Depositar\n4.) Rendimento mensal");
        int resposta = sc.nextInt();

        switch (resposta) 
        {
            //Ver Saldo:
            case 1:
                System.out.println(conta.Saldo);
                break;
            
            //Sacar:
            case 2 :
                System.out.println("Deseja sacar que quantia?");
                Double quantia = sc.nextDouble();
                while (quantia > conta.Saldo)
                {
                    System.out.println("O número que você esta sugerindo para saque é maior que o seu saldo.\nPor favor, insira um valor compatível com o seu saldo.");
                    quantia = sc.nextDouble();
                }
                    conta.Saldo = conta.Saldo - quantia;
                    System.out.println("Você irá sacar R$"+ quantia + " e irá sobrar R$"+conta.Saldo+" na sua conta.");
                break;

            //Depositar:
            case 3 :
                System.out.println("Insira o valor que você gostaria de depositar.");
                Double deposito = sc.nextDouble();
                conta.Saldo = conta.Saldo + deposito;
                System.out.println("Seu novo saldo é de "+ conta.Saldo);
                break;
            
            //Rendimento Mensal:
            case 4:
                System.out.println("Qual é o número de meses?");
                int meses = sc.nextInt();
                System.out.println("Qual é a porcentagem do rendimento? [digite somente o número]");
                Double porcentagem = sc.nextDouble();
                Double rendimento = porcentagem / meses;
                System.out.println("Seu rendimente no periodo de " + meses + " meses é de " + rendimento + "%");
        }

        //Final do Programa:
        System.out.println("Finalizar Programa?\n1.) Sim\n2.) Não");
        R = sc.nextInt();
        }
        sc.close();

    }
}