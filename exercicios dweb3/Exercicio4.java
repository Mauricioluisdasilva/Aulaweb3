import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args) {
        String nome;
        double n1, n2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite o nome do aluno(a): ");
        nome = ler.nextLine();
        
        System.out.println("digite a nota 1:");
        n1 = ler.nextDouble();
        System.out.println("digite o nota 2:");
        n2 = ler.nextDouble();
        
        System.out.println("a média do aluno: " + (n1 + (n2 * 2)) / 3);
  }}