import java.util.Scanner;

public class Ex6StringTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase completa: ");
        String frase = input.nextLine();
        frase = frase.toLowerCase();
        int cont = 0, a = 0, e = 0, i = 0, o = 0, u = 0;

        while (cont < frase.length()) {
            if (frase.charAt(cont) == 'a') {
                a = a + 1;
            } else if (frase.charAt(cont) == 'e') {
                e = e + 1;
            } else if (frase.charAt(cont) == 'i') {
                i = i + 1;
            } else if (frase.charAt(cont) == 'o') {
                o = o + 1;
            } else if (frase.charAt(cont) == 'u') {
                u = u + 1;
            }
            cont = cont + 1;
        }
        System.out.println("Histograma: ");

        System.out.print("a: ");
        for (cont = 0; cont < a; cont++) {
            System.out.print("*");
        }
        System.out.println("(" + a + ")");

        System.out.print("e: ");
        for (cont = 0; cont < e; cont++) {
            System.out.print("*");
        }
        System.out.println("(" + e + ")");

        System.out.print("i: ");
        for (cont = 0; cont < i; cont++) {
            System.out.print("*");
        }
        System.out.println("(" + i + ")");

        System.out.print("o: ");
        for (cont = 0; cont < o; cont++) {
            System.out.print("*");
        }
        System.out.println("(" + o + ")");

        System.out.print("u: ");
        for (cont = 0; cont < u; cont++) {
            System.out.print("*");
        }
        System.out.println("(" + u + ")");
    }
}