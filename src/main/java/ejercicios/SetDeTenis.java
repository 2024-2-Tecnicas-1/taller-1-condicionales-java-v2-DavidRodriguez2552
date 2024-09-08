package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {

        if ((numVictoriasA == 6 && numVictoriasB == 5) || (numVictoriasB == 6 && numVictoriasA == 5)) {
            return "Aún no termina";
        } else if (numVictoriasA <= 5 && numVictoriasB <= 5) {
            return "Aún no termina";
        } else if (numVictoriasA == numVictoriasB && numVictoriasA <= 6 && numVictoriasB <= 6) {
            return "Aún no termina";
        }

        if (numVictoriasB == 7 && (numVictoriasA == 6 || numVictoriasA == 5)) {
            return "Ganó B";
        }

        if (numVictoriasA == 7 && (numVictoriasB == 6 || numVictoriasB == 5)) {
            return "Ganó A";
        }

        if (numVictoriasA == 6 && numVictoriasB <= 4) {
            return "Ganó A";
        }

        if (numVictoriasB == 6 && numVictoriasA <= 4) {
            return "Ganó B";
        }

        return "Inválido";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}


