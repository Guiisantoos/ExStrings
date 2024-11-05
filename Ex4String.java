import java.util.Scanner;

public class Ex4String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        int cont = 0;
        int i = 0;

        while (i < frase.length()) {
            if (frase.charAt(i) == ' ') {
                cont = cont + 1;
            }
            i = i + 1;
        }
        System.out.println("Contagem de espaços: " + cont);

    }
}