package Chapter1;

public class Exercise12 {
    public static void main(String[] args) {
        double totalHours = 1 + (40.0 / 60.0) + (35.0 / 3600.00);
        double kmTraversed = 24 * 1.6;
        double velocity = kmTraversed / totalHours;

        System.out.println(velocity);
    }
}
