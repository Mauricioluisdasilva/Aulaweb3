import java.util.Scanner;

public class Exercicio3
{
 public static void main(String[] args) {
     double a;
     
     Scanner ler = new Scanner(System.in);
     a = ler.nextDouble();
     
     System.out.println("O dobro de A é: " + (a * 2));
     
     System.out.println("O triplo do dobro de A é: " + (a * 2) * 3);
     
     System.out.println("A metade do triplo do dobro de A é:" +(a * 2) * 3 /2);
     
     System.out.println("o quadrado da variável A é: " + Math.pow(a, 2));
     
     System.out.println("A quinta parte do dobro de A é:" + (a * 2) / 5);
 }
}