package Javanotes.Section_2;

public class Enums {
    enum PrivateDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum PrivateMonth {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

    public static void main(String[] args) {
        PrivateDay tgif = PrivateDay.FRIDAY;
        PrivateMonth libra = PrivateMonth.OCT;

        System.out.println("My sign is libra, since I was born in " + libra);
        System.out.println("That's the " + (libra.ordinal() + 1) + "-th month of the year.");

        System.out.println("Isn't it nice to get to " + tgif);

        System.out.println( tgif + " is the " + tgif.ordinal() + "-th day of the week.");
    }
}
