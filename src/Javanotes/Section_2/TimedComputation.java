package Javanotes.Section_2;

public class TimedComputation {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long endTime;
        long compTime;
        double seconds;

        // The sides of a triangle
        double width = 42.0;
        double height = 17.0;
        double hypotenuse = Math.sqrt((width*width) + (height*height));
        System.out.print("A triangle with sides 42 and 17 has hypotenuse ");
        System.out.println(hypotenuse);

        System.out.println("\nMathematically, sin(x)*sin(x) + cos(x)*cos(x) - 1 should be 0.");
        System.out.println("Let's check this for x = 100:");
        System.out.print("      sin(100)*sin(100) + cos(100)*cos(100) - 1 is: ");
        System.out.println(Math.sin(100) * Math.sin(100) + Math.cos(100)*Math.cos(100) - 1);
        System.out.println("(There can be round-off errors when computing with real numbers!)");

        System.out.print("\nHere is a random number:  ");
        System.out.println(Math.random());

        System.out.print("\nThe value of Math.PI is ");
        System.out.println(Math.PI);

        endTime = System.nanoTime();
        compTime = endTime - startTime;
        seconds = compTime / 1000000000.0;

        System.out.print("\nRun time in nanoseconds was: ");
        System.out.println(compTime);
        System.out.println("(This is probably not perfectly accurate!");
        System.out.print("\nRun time in seconds was:  ");
        System.out.println(seconds);
    }
}
