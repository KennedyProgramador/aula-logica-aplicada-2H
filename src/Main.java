import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declarar  variaveis
        int a;
        int b;
        //entrada de dados
        Scanner obj; //declaração
        obj = new Scanner(System.in); //construção
        //processamento de dados

        a = obj.nextInt();
        //saida de dados
        System.out.println("Entre com um número:");
        //processamento
        b = obj.nextInt();
        //processamento
        int soma = a+b;
//saida
        System.out.println(soma);
        //saida de dados
        System.out.println("Hello world!");
    }
}