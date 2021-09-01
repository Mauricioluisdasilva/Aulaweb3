import java.util.Scanner;

public class exercicio1{

    public static void main(String args[]) { 
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("digite sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println("*************************");
        System.out.println("seunome é: + nome");
        System.out.println("você tem:" + idade + "anos");
    }
}
