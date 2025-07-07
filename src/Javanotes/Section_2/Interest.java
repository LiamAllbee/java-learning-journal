package Javanotes.Section_2;

public class Interest {
    public static void main(String[] args) {
        double principal = 17000;
        double rate = 0.027;
        double interest = principal * rate;

        principal += interest;

        System.out.println("The interest earned is $" + interest);
        System.out.println("The value of the investment after one year is $" + principal);
    }
}
