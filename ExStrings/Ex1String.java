import java.util.Scanner;

public class Ex1String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro nome: ");
        String nome1 = input.nextLine();
        System.out.print("Digite o segundo nome: ");
        String nome2 = input.nextLine();

        System.out.println("Primeiro nome: " + nome1);
        System.out.println("Segundo nome: " + nome2);
        System.out.println("A segunda letra do primeiro nome é: " + nome1.charAt(1));
        System.out.println("A segunda letra do segundo nome é: " + nome2.charAt(1));
    }
}