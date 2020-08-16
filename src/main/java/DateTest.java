import java.util.Scanner;

public class DateTest {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha 1, día, mes y año: ");

        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        Date f1  = new Date(dia, mes, anio);

        System.out.println("Ingrese la fecha 2, día, mes y año: ");

        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();

        Date f2 = new Date(dia, mes, anio);

        System.out.println("Fecha 1: "+f1);
        System.out.println("Fecha 2: "+f2);

        if (f1.equals(f2))
        {
                System.out.println("Son iguales.");

        }
        else
            {
            System.out.println("Son diferentes.");
        }
    }
}
