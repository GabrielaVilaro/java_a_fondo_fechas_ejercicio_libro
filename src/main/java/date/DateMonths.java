package date;

public class DateMonths extends Date
{

    private static String months[] = { "Enero",
                                       "Febrero",
                                       "Marzo",
                                       "Abril",
                                       "Mayo",
                                       "Junio",
                                       "Julio",
                                        "Agosto",
                                       "Septiembre",
                                       "Octubre",
                                       "Noviembre",
                                       "Diciembre"
                                     };

    public DateMonths(int d, int m, int n) {
        super(d, m, n);
    }

    public String toString()
    {
        int m  = getMonth()-1;
        return getDay() + " de "+ months[m] + " de "+getYear();
    }
}
