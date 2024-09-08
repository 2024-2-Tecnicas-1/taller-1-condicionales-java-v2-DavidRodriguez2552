package ejercicios;

import java.time.LocalDate;
import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {

    public static String evaluar(int dia, int mes, int anno) {
        LocalDate hoy = LocalDate.now();
        int diaActual = hoy.getDayOfMonth();
        int mesActual = hoy.getMonthValue();
        int annoActual = hoy.getYear();

        int edad = annoActual - anno;
        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            edad -= 1;
        }

        return "Usted tiene " + edad + " años";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();

        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}

