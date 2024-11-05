import java.util.Scanner;

public class Ex5String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase completa: ");
        String frase = input.nextLine();
        int maiusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            Character caractere = frase.charAt(i);
            if (Character.isUpperCase(caractere)) {
                maiusculas++;
            }
        }
        if (maiusculas != 0) {
            System.out.println("A String possui " + maiusculas + " letras maiúsculas.");
        } else {
            System.out.println("A String não possui letras maiúsculas.");
        }

    }
}