import java.util.Scanner;

public class Ex3String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        frase = frase.toLowerCase();
        String frase1;
        int cont = 0;
        int i = 0;

        while (i < frase.length()) {
            if (frase.charAt(i) == 'a') {
                cont = cont + 1;
            }
            i = i + 1;
        }
        frase1 = frase.replace('a', '*');
        System.out.println("Frase: " + frase1);
        System.out.println("Vogais substituídas: " + cont);

    }
}