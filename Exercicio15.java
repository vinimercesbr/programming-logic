
import java.util.Scanner;


public class Exercicio15 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = leitura.next();
        System.out.println(" atribua a nota1: ");
        double nota1 = leitura.nextDouble();
        System.out.println(" atribua a nota2: ");
        double nota2 = leitura.nextDouble();
        System.out.println(" atribua a nota3: ");
        double nota3 = leitura.nextDouble();
        System.out.println(" atribua a nota4: ");
        double nota4 = leitura.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println(nome +" tem media final: "+ media );
    }
    
}