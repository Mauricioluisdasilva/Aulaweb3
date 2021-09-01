import java.util.Scanner;

public class exercicio2
{
    
    
public static void main ( String [] args) {
    
    int n1,n2,n3;
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("digite o primeiro número: " );
    n1 = ler.nextInt();
    
    System.out.println("digite o segundo número: " );
    n2 = ler.nextInt();
    
    System.out.println("digite o terceiro número: " );
    n3 = ler.nextInt();
    
    System.out.println("o valor da multiplicacão dostres numeros é" + n1 * n2 * n3);
} 
}   