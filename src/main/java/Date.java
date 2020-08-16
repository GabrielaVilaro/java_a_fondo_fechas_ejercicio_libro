public class Date {
    private int day;
    private  int month;
    private int year;

    public Date(int d, int m, int n) {
        setDay(d);
        setMonth(m);
        setYear(n);
    }

    public boolean equals(Object o)
    {
        Date otraFecha = (Date) o;
        return (day ==otraFecha.day)
                && (month ==otraFecha.month)
                && (year ==otraFecha.year);
    }

    //sobreescribo el método toString
    @Override
    public String toString() {
        return "Fecha: " + day +"/"+ month +"/"+ year;
    }
    //Getters y Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
