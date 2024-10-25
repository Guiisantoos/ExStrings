import java.util.Scanner;

public class Ex2String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu primeiro nome: ");
        String nome = input.nextLine();
        int cont = 0;
        int i = 0;
        String nome1 = nome.toLowerCase();

        while (i < nome1.length()) {
            if (nome1.charAt(i) == 'a' || nome1.charAt(i) == 'e' || nome1.charAt(i) == 'i' || nome1.charAt(i) == 'o'
                    || nome1.charAt(i) == 'u') {
                cont = cont + 1;
            }
            i = i + 1;
        }
        System.out.println("Seu nome possui " + cont + " vogais.");
    }
}